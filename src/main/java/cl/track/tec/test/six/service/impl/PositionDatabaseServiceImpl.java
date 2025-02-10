package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.mapper.PositionMapper;
import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.model.entity.PositionEntity;
import cl.track.tec.test.six.repository.PositionRepository;
import cl.track.tec.test.six.service.PositionDatabaseService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PositionDatabaseServiceImpl implements PositionDatabaseService {

    private final PositionMapper positionMapper;
    private final PositionRepository positionRepository;

    public PositionDatabaseServiceImpl(PositionMapper positionMapper, PositionRepository positionRepository) {
        this.positionMapper = positionMapper;
        this.positionRepository = positionRepository;
    }

    @Override
    public void save(PositionDto positionDto) {
        try {
            PositionEntity positionEntity = positionMapper.map(positionDto);
            positionRepository.save(positionEntity);
        } catch (Exception e) {
            System.out.println("Failed to insert position with IMEI: " + positionDto.getImei());
        }
    }

    @Override
    public Optional<PositionEntity> get(PositionDto positionDto) {
        String imei = positionDto.getImei();
        String licensePlate = positionDto.getLicensePlate();

        return positionRepository.findTopByImeiAndLicensePlateOrderByUtcDateDesc(imei, licensePlate);
    }
}
