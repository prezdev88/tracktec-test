package cl.track.tec.test.three.service.impl;

import cl.track.tec.test.three.model.BirthdateResponse;
import cl.track.tec.test.three.service.BirthdayService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
public class BirthdateServiceImpl implements BirthdayService {

    private final DateTimeFormatter dateTimeFormatter;

    public BirthdateServiceImpl(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public BirthdateResponse getDaysSince(String birthdate) {
        LocalDate formattedBirthdate = LocalDate.parse(birthdate, dateTimeFormatter);

        long days = ChronoUnit.DAYS.between(formattedBirthdate, LocalDate.now());

        return new BirthdateResponse(days);
    }
}
