package cl.track.tec.test.six.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GpsData {

    @JsonProperty("positions")
    private List<Position> positions;

    public List<Position> getPositions() {
        return positions;
    }
}
