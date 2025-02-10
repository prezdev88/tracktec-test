package cl.track.tec.test.four.controller;

import cl.track.tec.test.four.exception.DatetimeNotFoundException;
import cl.track.tec.test.four.exception.DatetimeNotFoundResponse;
import cl.track.tec.test.four.model.QueclinkDateResponse;
import cl.track.tec.test.four.service.QueclinkService;
import cl.track.tec.test.three.exception.BadFormatDateResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeParseException;

@RestController
@RequestMapping("/api/v1/test")
@Tag(name = "Queclink parser", description = "Get Queclink date")
public class QueclinkController {

    private final QueclinkService queclinkService;

    public QueclinkController(QueclinkService queclinkService) {
        this.queclinkService = queclinkService;
    }

    @GetMapping("/four/queclink/{gpsData}")
    @Operation(summary = "Get Queclink date")
    public ResponseEntity<QueclinkDateResponse> getQueclinkDate(@PathVariable String gpsData) {
        return ResponseEntity.ok(queclinkService.getQueclinkDate(gpsData));
    }

    @ExceptionHandler(DatetimeNotFoundException.class)
    public ResponseEntity<DatetimeNotFoundResponse> handleDatetimeNotFoundException(DatetimeNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new DatetimeNotFoundResponse());
    }
}
