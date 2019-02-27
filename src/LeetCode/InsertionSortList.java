package LeetCode;

public class InsertionSortList {
    public static void main(String[] args) {
        ListNode l_1 = new ListNode(5);
        ListNode sec = new ListNode(4);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(2);

        l_1.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println(insertionSortList(l_1));
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode base = head;
        while (head != null) {
            ListNode start = base.next;
            while (start != null) {
                int val = head.val;
                if (val > start.val) {
                    ListNode temp = start.next;
                    start.next = head;
                    head.next = temp;
                    head = start;
                } else {
                    start = start.next;
                    head = head.next;
                }
            }
            head = head.next;
        }
        return base;
    }
}
