package cl.track.tec.test.two.controller;

import cl.track.tec.test.two.model.PalindromeResponse;
import cl.track.tec.test.two.service.PalindromeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/test")
@Tag(name = "Palindrome", description = "Is a palindrome word")
public class PalindromeController {

    private final PalindromeService palindromeService;

    @GetMapping("/two/palindromes/{word}")
    @Operation(summary = "Is a palindrome word")
    public ResponseEntity<PalindromeResponse> isPalindrome(@PathVariable String word) {
        return ResponseEntity.ok(palindromeService.isPalindrome(word));
    }
}
