package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.model.GpsData;
import cl.track.tec.test.six.model.Position;
import cl.track.tec.test.six.service.CardinalDirectionService;
import cl.track.tec.test.six.service.DirectionService;
import org.springframework.stereotype.Service;

@Service
public class DirectionServiceImpl implements DirectionService {

    private final CardinalDirectionService cardinalDirectionService;

    public DirectionServiceImpl(CardinalDirectionService cardinalDirectionService) {
        this.cardinalDirectionService = cardinalDirectionService;
    }

    @Override
    public GpsData addDirection(GpsData gpsData) {
        for (Position position : gpsData.getPositions()) {
            String direction = cardinalDirectionService.getCardinalDirection(position);
            position.setDirection(direction);
        }

        return gpsData;
    }
}
