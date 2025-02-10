package cl.track.tec.test.five.service.impl;

import cl.track.tec.test.five.model.EncodedImeiResponse;
import cl.track.tec.test.five.service.EncodeImeiService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class EncodeImeiServiceImpl implements EncodeImeiService {

    private HashMap<Character, Integer> letters;

    @PostConstruct
    public void init() {
        letters = new HashMap<>();

        int index = 1;
        for (int i = 97; i <= 122; i++) {
            letters.put((char) i, index++);
        }
    }

    @Override
    public EncodedImeiResponse encode(String imei) {
        imei = imei.toLowerCase();

        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < imei.length(); i++) {
            char letter = imei.charAt(i);
            encoded.append(letters.get(letter));
        }

        return new EncodedImeiResponse(encoded.toString());
    }
}
