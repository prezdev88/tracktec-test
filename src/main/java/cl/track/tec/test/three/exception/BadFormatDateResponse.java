package cl.track.tec.test.three.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadFormatDateResponse {

    private String message;

    public BadFormatDateResponse() {
        this.message = "The provided date format is incorrect. It should be YYYY-MM-DD.";
    }
}
