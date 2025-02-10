package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.model.dto.GpsDataDto;
import cl.track.tec.test.six.service.DirectionService;
import cl.track.tec.test.six.service.GpsFacadeService;
import cl.track.tec.test.six.service.PositionService;
import org.springframework.stereotype.Service;

@Service
public class GpsFacadeServiceImpl implements GpsFacadeService {

    private final DirectionService directionService;
    private final PositionService positionService;

    public GpsFacadeServiceImpl(DirectionService directionService, PositionService positionService) {
        this.directionService = directionService;
        this.positionService = positionService;
    }

    @Override
    public GpsDataDto execute(GpsDataDto gpsDataDto) {
        gpsDataDto = directionService.addDirection(gpsDataDto);

        positionService.sort(gpsDataDto.getPositions());
        positionService.save(gpsDataDto.getPositions());

        return gpsDataDto;
    }
}
