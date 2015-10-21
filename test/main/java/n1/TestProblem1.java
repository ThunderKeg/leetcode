package n1;

import n1.Solution;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author <a href="mailto:huangyujie.hyj@alibaba-inc.com">班吉</a>
 * @version V1.0.0
 * @since 10/21/15
 */
public class TestProblem1 {
    @Test
    public void test1() {

        Solution s1 = new Solution();
        assertArrayEquals(new int[] {2, 3} , s1.twoSum(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {1, 2}, s1.twoSum(new int[] {2, 7, 11, 15}, 9));

    }
}
