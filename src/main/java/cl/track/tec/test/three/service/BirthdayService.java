package cl.track.tec.test.three.service;

import cl.track.tec.test.three.model.BirthdateResponse;

public interface BirthdayService {
    BirthdateResponse getDaysSince(String birthdate);
}
