package n4;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestProblem4 {

    @Test
    public void testHelper() {
        assertEquals(-1, find(0));
        assertEquals(0, find(1));
        assertEquals(0, find(2));
        assertEquals(1, find(3));
        assertEquals(2, find(4));
        assertEquals(3, find(5));
        assertEquals(3, find(6));
        assertEquals(4, find(7));
        assertEquals(4, find(8));
        assertEquals(5, find(9));
        assertEquals(6, find(10));

    }

    private int find(int x) {
        Solution s4 = new Solution();
        return s4.findNearestIndex(new int[]{1,3,4,5,7,9}, 0, 6, x);
    }

}
