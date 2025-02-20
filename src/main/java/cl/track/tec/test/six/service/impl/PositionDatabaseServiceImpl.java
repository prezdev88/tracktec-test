package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.mapper.PositionMapper;
import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.model.entity.PositionEntity;
import cl.track.tec.test.six.repository.PositionRepository;
import cl.track.tec.test.six.service.PositionDatabaseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class PositionDatabaseServiceImpl implements PositionDatabaseService {

    private final PositionMapper positionMapper;
    private final PositionRepository positionRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(PositionDto positionDto) {
        try {
            PositionEntity positionEntity = positionMapper.map(positionDto);
            positionRepository.save(positionEntity);
        } catch (Exception e) {
            log.info("Failed to insert position with IMEI: {}", positionDto.getImei());
        }
    }

    @Override
    public Optional<PositionEntity> get(PositionDto positionDto) {
        String imei = positionDto.getImei();
        String licensePlate = positionDto.getLicensePlate();

        return positionRepository.findTopByImeiAndLicensePlateOrderByUtcDateDesc(imei, licensePlate);
    }
}
