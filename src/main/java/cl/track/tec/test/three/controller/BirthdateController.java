package cl.track.tec.test.three.controller;

import cl.track.tec.test.three.exception.BadFormatDateResponse;
import cl.track.tec.test.three.model.BirthdateResponse;
import cl.track.tec.test.three.service.BirthdayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeParseException;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/test")
@Tag(name = "Birthdate days", description = "Get days since date of birth")
public class BirthdateController {

    private final BirthdayService birthdayService;

    @GetMapping("/three/birthdate/{birthdate}")
    @Operation(summary = "Get days since date of birth")
    public ResponseEntity<BirthdateResponse> getDaysSinceBirthdate(
            @Parameter(description = "Birthdate in YYYY-MM-DD format", example = "1988-09-07")
            @PathVariable String birthdate
    ) {
        return ResponseEntity.ok(birthdayService.getDaysSince(birthdate));
    }

    @ExceptionHandler(DateTimeParseException.class)
    public ResponseEntity<BadFormatDateResponse> handleDateTimeParseException(DateTimeParseException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new BadFormatDateResponse());
    }
}
