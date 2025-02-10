package cl.track.tec.test.four.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class QueclinkDateResponse {

    private LocalDateTime localDateTime;

    public QueclinkDateResponse(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        this.localDateTime = LocalDateTime.parse(date, dateTimeFormatter);
    }
}
