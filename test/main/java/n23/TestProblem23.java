package n23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem23 {

    @Test
    public void test23() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(3);
        ListNode n3 = new ListNode(2);
        n3.next = new ListNode(5);

        Solution s23 = new Solution();
        assertEquals("1->2->3->5", s23.mergeKLists(new ListNode[]{n1, n3}).toString());

        ListNode nn1 = new ListNode(1);
        nn1.next = new ListNode(2);
        nn1.next.next = new ListNode(2);

        ListNode nn2 = new ListNode(1);
        nn2.next = new ListNode(1);
        nn2.next.next = new ListNode(2);

        System.out.println(s23.mergeKLists(new ListNode[]{nn1, nn2}));



    }
}
