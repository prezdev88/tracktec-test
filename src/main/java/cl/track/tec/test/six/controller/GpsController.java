package cl.track.tec.test.six.controller;

import cl.track.tec.test.six.model.GpsData;
import cl.track.tec.test.six.service.DirectionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
@Tag(name = "GPS Data", description = "GPS Data")
public class GpsController {

    private final DirectionService directionService;

    public GpsController(DirectionService directionService) {
        this.directionService = directionService;
    }

    @PostMapping("/six/gps/positions")
    @Operation(summary = "Gps Data")
    public ResponseEntity<GpsData> addDirection(@RequestBody GpsData gpsData) {
        return ResponseEntity.ok(directionService.addDirection(gpsData));
    }
}
