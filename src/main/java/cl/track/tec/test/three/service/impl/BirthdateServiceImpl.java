package cl.track.tec.test.three.service.impl;

import cl.track.tec.test.three.model.BirthdateResponse;
import cl.track.tec.test.three.service.BirthdayService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
@AllArgsConstructor
public class BirthdateServiceImpl implements BirthdayService {

    private final DateTimeFormatter dateTimeFormatter;

    @Override
    public BirthdateResponse getDaysSince(String birthdate) {
        LocalDate formattedBirthdate = LocalDate.parse(birthdate, dateTimeFormatter);

        long days = ChronoUnit.DAYS.between(formattedBirthdate, LocalDate.now());

        return new BirthdateResponse(days);
    }
}
