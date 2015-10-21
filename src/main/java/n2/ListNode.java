package n2;

public class ListNode {
    public int val;
    public ListNode next;

    @Override
    public String toString() {
        return val + "";
    }

    public ListNode(int x) {
        val = x;
    }
}