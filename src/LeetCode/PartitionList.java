package LeetCode;

public class PartitionList {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode sec = new ListNode(4);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(2);

       /* first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;*/

        System.out.println(partition(first, 2));

    }

    public static ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(-1);
        ListNode start = before;
        ListNode after = new ListNode(-1);
        ListNode mid = after;
        if (head != null) {
            while (head != null) {
                if (head.val < x) {
                    before.next = new ListNode(head.val);
                    before = before.next;
                    head = head.next;
                } else {
                    after.next = new ListNode(head.val);
                    after = after.next;
                    head = head.next;
                }
            }
            if (mid.next != null) {
                before.next = mid.next;
            }
            if (before.val == -1) {
                start = mid;
            }
        }
        return start.next;
    }
}
