package cl.track.tec.test.four.exception;

public class DatetimeNotFoundResponse {

    private String message;

    public DatetimeNotFoundResponse() {
        this.message = "Cannot find the datetime in gps data";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
