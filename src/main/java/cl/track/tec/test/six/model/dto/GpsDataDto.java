package cl.track.tec.test.six.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GpsDataDto {

    @JsonProperty("positions")
    private List<PositionDto> positions;

    public List<PositionDto> getPositions() {
        return positions;
    }
}
