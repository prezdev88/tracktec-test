package cl.track.tec.test.six.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class Position {
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

    public int getOrientation() {
        return orientation;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
