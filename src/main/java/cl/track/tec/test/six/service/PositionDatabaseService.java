package cl.track.tec.test.six.service;

import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.model.entity.PositionEntity;

import java.util.Optional;

public interface PositionDatabaseService {
    void save(PositionDto positionDto);

    Optional<PositionEntity> get(PositionDto positionDto);
}
