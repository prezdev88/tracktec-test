package cl.track.tec.test.six.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GpsDataDto {
    @JsonProperty("positions")
    private List<PositionDto> positions;
}
