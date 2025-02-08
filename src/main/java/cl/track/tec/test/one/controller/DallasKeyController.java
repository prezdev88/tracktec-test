package cl.track.tec.test.one.controller;

import cl.track.tec.test.one.model.InvertedDallasKeyResponse;
import cl.track.tec.test.one.service.DallasKeyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
@Tag(name = "Dallas Key", description = "Dallas key exercise")
public class DallasKeyController {

    private final DallasKeyService dallasKeyService;

    public DallasKeyController(DallasKeyService dallasKeyService) {
        this.dallasKeyService = dallasKeyService;
    }

    @GetMapping("/one/dallas-keys/{dallasKey}/invert")
    @Operation(summary = "Invert a dallas key")
    public ResponseEntity<InvertedDallasKeyResponse> invert(@PathVariable String dallasKey) {
        return ResponseEntity.ok(dallasKeyService.invert(dallasKey));
    }
}
