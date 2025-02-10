package cl.track.tec.test.five.service.impl;

import cl.track.tec.test.five.model.EncodedImeiResponse;
import cl.track.tec.test.five.service.EncodeImeiService;
import org.springframework.stereotype.Service;

@Service
public class EncodeImeiServiceImpl implements EncodeImeiService {

    @Override
    public EncodedImeiResponse encode(String imei) {
        return new EncodedImeiResponse("000123");
    }
}
