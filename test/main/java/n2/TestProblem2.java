package n2;

import org.junit.Test;

public class TestProblem2 {
    @Test
    public void test2() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution s2 = new Solution();
        ListNode l3 = s2.addTwoNumbers(l1, l2);
        System.out.println(listNodeToString(l3));
    }

    private String listNodeToString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node);
            if (node.next != null) {
                sb.append(" -> ");
            }
            node = node.next;
        }
        return sb.toString();
    }
}
