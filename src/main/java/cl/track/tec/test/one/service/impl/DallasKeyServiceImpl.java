package cl.track.tec.test.one.service.impl;

import cl.track.tec.test.one.model.InvertedDallasKeyResponse;
import cl.track.tec.test.one.service.DallasKeyService;
import cl.track.tec.test.one.service.InvertService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DallasKeyServiceImpl implements DallasKeyService {

    private final InvertService invertService;

    @Override
    public InvertedDallasKeyResponse invert(String dallasKey) {
        String invertedDallasKey = invertService.invert(dallasKey);
        return new InvertedDallasKeyResponse(invertedDallasKey);
    }
}
