package cl.track.tec.test.six.mapper;

import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.model.entity.PositionEntity;

public interface PositionMapper {
    PositionEntity map(PositionDto positionDto);
}
