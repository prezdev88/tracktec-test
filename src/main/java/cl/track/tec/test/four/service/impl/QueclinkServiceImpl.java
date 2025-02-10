package cl.track.tec.test.four.service.impl;

import cl.track.tec.test.four.exception.DatetimeNotFoundException;
import cl.track.tec.test.four.model.QueclinkDateResponse;
import cl.track.tec.test.four.service.QueclinkService;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class QueclinkServiceImpl implements QueclinkService {

    @Override
    public QueclinkDateResponse getQueclinkDate(String gpsData) {
        Pattern pattern = Pattern.compile(",(\\d{14}),");
        Matcher matcher = pattern.matcher(gpsData);

        if (!matcher.find()) {
            throw new DatetimeNotFoundException();
        }

        String datetime = matcher.group(1);

        return new QueclinkDateResponse(datetime);
    }
}
