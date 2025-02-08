package cl.track.tec.test.two.model;

public class PalindromeResponse {

    private boolean palindrome;

    public PalindromeResponse(boolean palindrome) {
        this.palindrome = palindrome;
    }

    public boolean isPalindrome() {
        return palindrome;
    }

    public void setPalindrome(boolean palindrome) {
        this.palindrome = palindrome;
    }
}
