package cl.track.tec.test.five.controller;

import cl.track.tec.test.five.model.EncodedImeiResponse;
import cl.track.tec.test.five.service.EncodeImeiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
@Tag(name = "Encode Imei", description = "Encode Imei")
public class ImeiController {

    private final EncodeImeiService encodeImeiService;

    public ImeiController(EncodeImeiService encodeImeiService) {
        this.encodeImeiService = encodeImeiService;
    }

    @GetMapping("/five/imei/{imei}/encode")
    @Operation(summary = "Encode Imei")
    public ResponseEntity<EncodedImeiResponse> encodeImei(@PathVariable String imei) {
        return ResponseEntity.ok(encodeImeiService.encode(imei));
    }
}
