package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.model.dto.GpsDataDto;
import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.service.CardinalDirectionService;
import cl.track.tec.test.six.service.DirectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionServiceImpl implements DirectionService {

    private final CardinalDirectionService cardinalDirectionService;

    public DirectionServiceImpl(CardinalDirectionService cardinalDirectionService) {
        this.cardinalDirectionService = cardinalDirectionService;
    }

    @Override
    public GpsDataDto addDirection(GpsDataDto gpsDataDto) {
        List<PositionDto> positions = gpsDataDto.getPositions();

        positions.forEach(positionDto -> {
            String direction = cardinalDirectionService.getCardinalDirection(positionDto);
            positionDto.setDirection(direction);
        });

        return gpsDataDto;
    }
}
