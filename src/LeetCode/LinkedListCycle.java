package LeetCode;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode l_1 = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        l_1.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = l_1;

        System.out.println(detectCycle(l_1));
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (p != null && p.next != null) {
            p = p.next.next;
            q = q.next;
            if (p == q) {
                q = head;
                while (p != q) {
                    p = p.next;
                    q = q.next;
                }
                return p;
            }
        }
        return null;
    }
}
