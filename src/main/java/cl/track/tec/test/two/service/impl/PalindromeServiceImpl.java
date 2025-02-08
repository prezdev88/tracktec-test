package cl.track.tec.test.two.service.impl;

import cl.track.tec.test.two.model.PalindromeResponse;
import cl.track.tec.test.two.service.PalindromeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PalindromeServiceImpl implements PalindromeService {

    @Override
    public PalindromeResponse isPalindrome(String word) {
        return new PalindromeResponse(true);
    }
}
