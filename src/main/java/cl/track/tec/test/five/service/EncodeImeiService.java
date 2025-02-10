package cl.track.tec.test.five.service;

import cl.track.tec.test.five.model.EncodedImeiResponse;

public interface EncodeImeiService {
    EncodedImeiResponse encode(String imei);
}
