package cl.track.tec.test.six.repository;

import cl.track.tec.test.six.model.entity.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity, String> {
    Optional<PositionEntity> findTopByImeiAndLicensePlateOrderByUtcDateDesc(String imei, String licensePlate);
}
