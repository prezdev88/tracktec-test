package cl.track.tec.test.three.exception;

public class BadFormatDateResponse {

    private String message;

    public BadFormatDateResponse() {
        this.message = "The provided date format is incorrect. It should be YYYY-MM-DD.";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
