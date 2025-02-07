package cl.track.tec.test.one.service;

import cl.track.tec.test.one.model.InvertedDallasKeyResponse;

public interface DallasKeyService {
    InvertedDallasKeyResponse invert(String dallasKey);
}
