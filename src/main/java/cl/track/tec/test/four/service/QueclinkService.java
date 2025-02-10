package cl.track.tec.test.four.service;

import cl.track.tec.test.four.model.QueclinkDateResponse;

public interface QueclinkService {
    QueclinkDateResponse getQueclinkDate(String gpsData);
}
