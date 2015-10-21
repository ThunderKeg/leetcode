package n2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode current = null;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        boolean carry = false;
        do {
            if (root == null) {
                current = carryIfNeeded(addTwoNode(currentNode1, currentNode2), carry);
                root = current;
            } else {
                current.next = carryIfNeeded(addTwoNode(currentNode1, currentNode2), carry);
                current = current.next;
            }
            currentNode1 = currentNode1 == null ? null : currentNode1.next;
            currentNode2 = currentNode2 == null ? null : currentNode2.next;
            if (current != null && current.val > 9) {
                current.val = current.val % 10;
                carry = true;
            } else {
                carry = false;
            }
        } while (current != null);
        return root;
    }

    private ListNode carryIfNeeded(ListNode node, boolean carry) {
        if (carry) {
            if (node == null) {
                return new ListNode(1);
            } else {
                node.val++;
                return node;
            }
        }
        return node;
    }

    private ListNode addTwoNode(ListNode currentNode1, ListNode currentNode2) {
        if (currentNode1 != null && currentNode2 != null) {
            ListNode res = new ListNode(currentNode1.val + currentNode2.val);
            return res;
        }
        if (currentNode1 == null && currentNode2 == null) {
            return null;
        }
        if (currentNode1 != null) {
            return currentNode1;
        }
        return currentNode2;
    }
}