package n5;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestProblem5 {

    @Test
    public void test() {
        Solution s5 = new Solution();
        assertEquals("a", s5.longestPalindrome("a"));
        assertEquals("aaaaaa", s5.longestPalindrome("aaaaaa"));
        assertEquals("a", s5.longestPalindrome("abcdefg"));
        assertEquals("abcddcba", s5.longestPalindrome("abccbaabcddcba"));
    }
}
