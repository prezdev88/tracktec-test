package cl.track.tec.test.four.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatetimeNotFoundResponse {

    private String message;

    public DatetimeNotFoundResponse() {
        this.message = "Cannot find the datetime in gps data";
    }
}
