package cl.track.tec.test.six.controller;

import cl.track.tec.test.six.model.dto.GpsDataDto;
import cl.track.tec.test.six.service.GpsFacadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/test")
@Tag(name = "GPS Positions", description = "GPS Positions")
public class PositionController {

    private final GpsFacadeService gpsFacadeService;

    public PositionController(GpsFacadeService gpsFacadeService) {
        this.gpsFacadeService = gpsFacadeService;
    }

    @PostMapping("/six/gps/positions")
    @Operation(summary = "Gps Data")
    public ResponseEntity<GpsDataDto> addDirection(@RequestBody GpsDataDto gpsDataDto) {
        return ResponseEntity.ok(gpsFacadeService.execute(gpsDataDto));
    }
}
