package n1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestProblem1 {
    @Test
    public void test1() {

        Solution s1 = new Solution();
        assertArrayEquals(new int[]{2, 3}, s1.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, s1.twoSum(new int[]{2, 7, 11, 15}, 9));

    }
}
