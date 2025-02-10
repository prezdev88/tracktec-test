package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.model.dto.GpsDataDto;
import cl.track.tec.test.six.service.DirectionService;
import cl.track.tec.test.six.service.GpsFacadeService;
import cl.track.tec.test.six.service.PositionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GpsFacadeServiceImpl implements GpsFacadeService {

    private final PositionService positionService;
    private final DirectionService directionService;

    @Override
    public GpsDataDto execute(GpsDataDto gpsDataDto) {
        gpsDataDto = directionService.addDirection(gpsDataDto);

        positionService.sort(gpsDataDto.getPositions());
        positionService.save(gpsDataDto.getPositions());

        return gpsDataDto;
    }
}
