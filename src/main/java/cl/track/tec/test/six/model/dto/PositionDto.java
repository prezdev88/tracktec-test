package cl.track.tec.test.six.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class PositionDto {
    @JsonProperty("proveedor_gps")
    private String gpsProvider;

    @JsonProperty("contratista")
    private String contractor;

    @JsonProperty("imei")
    private String imei;

    @JsonProperty("patente")
    private String licensePlate;

    @JsonProperty("fecha_utc")
    private OffsetDateTime utcDate;

    @JsonProperty("latitud")
    private double latitude;

    @JsonProperty("longitud")
    private double longitude;

    @JsonProperty("orientacion")
    private int orientation;

    @JsonProperty("velocidad_gps")
    private int gpsSpeed;

    @JsonProperty("estado_motor")
    private int engineState;

    @JsonProperty("hdop")
    private double hdop;

    @JsonProperty("codigo_evento")
    private int eventCode;

    @JsonProperty("cant_satelites")
    private int satelliteCount;

    @JsonProperty("odometro_gps")
    private double gpsOdometer;

    @JsonProperty("horometro_gps")
    private double gpsHourMeter;

    @JsonProperty("sentido")
    private String direction;

    public String getGpsProvider() {
        return gpsProvider;
    }

    public void setGpsProvider(String gpsProvider) {
        this.gpsProvider = gpsProvider;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
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

    public int getGpsSpeed() {
        return gpsSpeed;
    }

    public void setGpsSpeed(int gpsSpeed) {
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
