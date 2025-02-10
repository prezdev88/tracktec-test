package cl.track.tec.test.six.service.impl;

import cl.track.tec.test.six.model.dto.PositionDto;
import cl.track.tec.test.six.model.entity.PositionEntity;
import cl.track.tec.test.six.service.PositionDatabaseService;
import cl.track.tec.test.six.service.PositionService;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {

    private final PositionDatabaseService positionDatabaseService;

    public PositionServiceImpl(PositionDatabaseService positionDatabaseService) {
        this.positionDatabaseService = positionDatabaseService;
    }

    @Override
    public void sort(List<PositionDto> positions) {
        positions.sort(Comparator.comparing(PositionDto::getUtcDate));
    }

    @Override
    public void save(List<PositionDto> positions) {
        positions.forEach(positionDto -> {
            Optional<PositionEntity> existingPosition = positionDatabaseService.get(positionDto);

            if (existingPosition.isEmpty()) {
                positionDatabaseService.save(positionDto);
                return;
            }

            PositionEntity lastPosition = existingPosition.get();

            if (isNewPositionLaterThanLast(positionDto, lastPosition)) {
                positionDatabaseService.save(positionDto);
            }
        });
    }

    private boolean isNewPositionLaterThanLast(PositionDto positionDto, PositionEntity lastPosition) {
        OffsetDateTime newUtcDate = positionDto.getUtcDate();
        OffsetDateTime lastUtcDate = lastPosition.getUtcDate();

        return newUtcDate.isAfter(lastUtcDate);
    }
}
