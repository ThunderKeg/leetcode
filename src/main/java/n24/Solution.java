package n24;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;

        ListNode nextHead = head;
        ListNode headPrevious = null;
        do {
            headPrevious = swapOne(nextHead, headPrevious);
            if (headPrevious != null) {
                nextHead = headPrevious.next;
            }
        } while (headPrevious != null && nextHead != null);

        return newHead;
    }

    private ListNode swapOne(ListNode head, ListNode previous) {
        ListNode newHead = head.next;
        if (newHead == null) {
            return null;
        }
        ListNode nextHead = newHead.next;
        newHead.next = head;
        head.next = nextHead;
        if (previous != null) {
            previous.next = newHead;
        }
        return head;
    }
}
