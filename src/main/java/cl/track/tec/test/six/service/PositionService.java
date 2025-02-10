package cl.track.tec.test.six.service;

import cl.track.tec.test.six.model.dto.PositionDto;

import java.util.List;

public interface PositionService {
    void sort(List<PositionDto> positions);

    void save(List<PositionDto> positions);
}
