package cl.track.tec.test.six.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.OffsetDateTime;

@Entity
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

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getProviderGps() {
        return providerGps;
    }

    public void setProviderGps(String providerGps) {
        this.providerGps = providerGps;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public OffsetDateTime getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(OffsetDateTime utcDate) {
        this.utcDate = utcDate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public double getGpsSpeed() {
        return gpsSpeed;
    }

    public void setGpsSpeed(double gpsSpeed) {
        this.gpsSpeed = gpsSpeed;
    }

    public int getEngineState() {
        return engineState;
    }

    public void setEngineState(int engineState) {
        this.engineState = engineState;
    }

    public double getHdop() {
        return hdop;
    }

    public void setHdop(double hdop) {
        this.hdop = hdop;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

    public void setSatelliteCount(int satelliteCount) {
        this.satelliteCount = satelliteCount;
    }

    public double getGpsOdometer() {
        return gpsOdometer;
    }

    public void setGpsOdometer(double gpsOdometer) {
        this.gpsOdometer = gpsOdometer;
    }

    public double getGpsHourMeter() {
        return gpsHourMeter;
    }

    public void setGpsHourMeter(double gpsHourMeter) {
        this.gpsHourMeter = gpsHourMeter;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
