package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.service.CardinalDirectionService;
import org.springframework.stereotype.Service;

@Service
public class CardinalDirectionServiceImpl implements CardinalDirectionService {
    @Override
    public String getCardinalDirection(PositionDto positionDto) {
        int orientation = positionDto.getOrientation();

        if (orientation < 0 || orientation >= 360) {
            return "Desconocido";
        }

        if (orientation < 45 || orientation >= 315) {
            return "Norte";
        } else if (orientation < 135) {
            return "Este";
        } else if (orientation < 225) {
            return "Sur";
        } else {
            return "Oeste";
        }
    }
}
