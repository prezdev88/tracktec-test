package cl.track.tec.test.four.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QueclinkDateResponse {

    private LocalDateTime localDateTime;

    public QueclinkDateResponse(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        this.localDateTime = LocalDateTime.parse(date, dateTimeFormatter);
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
