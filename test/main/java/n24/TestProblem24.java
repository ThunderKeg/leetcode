package n24;

import org.junit.Test;

public class TestProblem24 {

    @Test
    public void test24() {
        Solution s24 = new Solution();
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
//        n1.next.next = new ListNode(3);
//        n1.next.next.next = new ListNode(4);
//        n1.next.next.next.next = new ListNode(5);
        System.out.println(s24.swapPairs(n1));
    }
}
