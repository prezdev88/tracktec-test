package cl.track.tec.test.one.service.impl;

import cl.track.tec.test.one.model.IButtonResponse;
import cl.track.tec.test.one.service.IButtonService;
import cl.track.tec.test.one.service.InvertService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IButtonServiceImpl implements IButtonService {

    private final InvertService invertService;

    @Override
    public IButtonResponse invert(String id) {
        String invertedId = invertService.invert(id);
        return new IButtonResponse(invertedId);
    }
}
