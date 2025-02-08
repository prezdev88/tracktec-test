package cl.track.tec.test.two.service.impl;

import cl.track.tec.test.two.model.PalindromeResponse;
import cl.track.tec.test.two.service.PalindromeService;
import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImpl implements PalindromeService {

    @Override
    public PalindromeResponse isPalindrome(String word) {
        word = word.replace(" ", "").toLowerCase();
        int length = word.length();

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return new PalindromeResponse(false);
            }
        }

        return new PalindromeResponse(true);
    }
}
