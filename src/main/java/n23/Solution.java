package n23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        SortedSet<ListNode> sortedSet = new TreeSet<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val == o2.val) {
                    return -1;
                }
                return o1.val - o2.val;
            }
        });
        addToSet(sortedSet, lists);
        Iterator<ListNode> iterator = sortedSet.iterator();

        if (!iterator.hasNext()) {
            return null;
        }
        ListNode first = iterator.next();
        ListNode previous = first;
        while (iterator.hasNext()) {
            ListNode current = iterator.next();
            previous.next = current;
            previous = current;
        }
        return first;
    }

    private void addToSet(SortedSet<ListNode> sortedSet, ListNode[] lists) {
        for (ListNode list : lists) {
            addOneToSet(sortedSet, list);
        }
    }

    private void addOneToSet(SortedSet<ListNode> sortedSet, ListNode list) {
        ListNode current = list;
        while (current != null) {
            sortedSet.add(current);
            ListNode next = current.next;
            current.next = null;
            current = next;
        }
    }
}