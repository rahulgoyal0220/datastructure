package LeetCode;

public class ReorderList {
    public static void main(String[] args) {
        ListNode l_1 = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        l_1.next = sec;
        sec.next = third;
        third.next = fourth;
//        fourth.next = fifth;

        System.out.println(reorderList(l_1));
    }

    public static ListNode reorderList(ListNode head) {
        ListNode start = head;
        if (head != null) {
            while (head != null) {
                ListNode trav = head;
                ListNode pev = null;
                while (trav.next != null) {
                    pev = trav;
                    trav = trav.next;
                }
                ListNode temp = head.next;
                head.next = trav;
                trav.next = temp;
                if (pev != null) {
                    pev.next = null;
                }
                head = temp;
            }
        }
        return start;

    }
}
