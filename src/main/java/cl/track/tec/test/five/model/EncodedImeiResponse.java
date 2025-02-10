package cl.track.tec.test.five.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EncodedImeiResponse {

    private String imei;

    public EncodedImeiResponse(String imei) {
        this.imei = fillWithZerosToLength(imei);
    }

    private String fillWithZerosToLength(String encoded) {
        int encodedLength = encoded.length();

        if (encodedLength >= 15) {
            return encoded;
        }

        int zeroCount = 15 - encodedLength;
        String zeros = "0".repeat(zeroCount);

        return zeros + encoded;
    }
}
