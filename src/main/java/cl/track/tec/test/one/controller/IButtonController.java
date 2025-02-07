package cl.track.tec.test.one.controller;

import cl.track.tec.test.one.model.IButtonResponse;
import cl.track.tec.test.one.service.IButtonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/test/one")
public class IButtonController {

    private final IButtonService iButtonService;

    @GetMapping("/invert/{id}")
    public ResponseEntity<IButtonResponse> invert(@PathVariable String id) {
        IButtonResponse iButtonResponse = iButtonService.invert(id);

        return ResponseEntity.ok(iButtonResponse);
    }
}
