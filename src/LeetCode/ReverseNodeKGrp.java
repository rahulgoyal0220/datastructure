package LeetCode;

public class ReverseNodeKGrp {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;


        System.out.println(reverseKGroup(first, 2));

    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }


        return prev;
    }
}
