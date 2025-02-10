package cl.track.tec.test.six.mapper.impl;

import cl.track.tec.test.six.mapper.PositionMapper;
import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.model.entity.PositionEntity;
import org.springframework.stereotype.Service;

@Service
public class PositionMapperImpl implements PositionMapper {
    @Override
    public PositionEntity map(PositionDto positionDto) {
        PositionEntity positionEntity = new PositionEntity();

        positionEntity.setProviderGps(positionDto.getGpsProvider());
        positionEntity.setContractor(positionDto.getContractor());
        positionEntity.setImei(positionDto.getImei());
        positionEntity.setLicensePlate(positionDto.getLicensePlate());
        positionEntity.setUtcDate(positionDto.getUtcDate());
        positionEntity.setLatitude(positionDto.getLatitude());
        positionEntity.setLongitude(positionDto.getLongitude());
        positionEntity.setOrientation(positionDto.getOrientation());
        positionEntity.setGpsSpeed(positionDto.getGpsSpeed());
        positionEntity.setEngineState(positionDto.getEngineState());
        positionEntity.setHdop(positionDto.getHdop());
        positionEntity.setEventCode(positionDto.getEventCode());
        positionEntity.setSatelliteCount(positionDto.getSatelliteCount());
        positionEntity.setGpsOdometer(positionDto.getGpsOdometer());
        positionEntity.setGpsHourMeter(positionDto.getGpsHourMeter());
        positionEntity.setDirection(positionDto.getDirection());

        return positionEntity;
    }
}
