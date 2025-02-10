package cl.track.tec.test.six.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity(name = "position")
public class PositionEntity {
    @Id
    private String imei;
    private String providerGps;
    private String contractor;
    private String licensePlate;
    private OffsetDateTime utcDate;
    private double latitude;
    private double longitude;
    private int orientation;
    private double gpsSpeed;
    private int engineState;
    private double hdop;
    private int eventCode;
    private int satelliteCount;
    private double gpsOdometer;
    private double gpsHourMeter;
    private String direction;
}
