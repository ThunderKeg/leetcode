package n3;

import junit.framework.Assert;
import org.junit.Test;

public class TestProblem3 {

    @Test
    public void test3() {
        Solution s3 = new Solution();

        Assert.assertEquals(1, s3.lengthOfLongestSubstring("bbbb"));
        Assert.assertEquals(3, s3.lengthOfLongestSubstring("abbaabc"));
        Assert.assertEquals(6, s3.lengthOfLongestSubstring("abccbaabcdef"));
        Assert.assertEquals(2, s3.lengthOfLongestSubstring("ab"));
    }
}
