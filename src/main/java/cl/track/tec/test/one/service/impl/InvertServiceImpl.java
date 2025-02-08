package cl.track.tec.test.one.service.impl;

import cl.track.tec.test.one.service.InvertService;
import org.springframework.stereotype.Service;

@Service
public class InvertServiceImpl implements InvertService {
    @Override
    public String invert(String dallasKey) {
        StringBuilder inverted = new StringBuilder(dallasKey.length());

        for (int i = dallasKey.length(); i >= 2; i -= 2) {
            inverted.append(dallasKey, i - 2, i);
        }

        return inverted.toString();
    }

}
