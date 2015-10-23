package n11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem11 {
    @Test
    public void test11() {
        Solution s11 = new Solution();
        assertEquals(12, s11.maxArea(new int[]{3, 4, 2, 1, 3, 2, 1, 2,2 ,4 ,10, 2}));
    }


}
