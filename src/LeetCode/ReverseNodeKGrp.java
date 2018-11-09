package LeetCode;

public class ReverseNodeKGrp {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        //   first.next = sec;
//        sec.next = third;
       /* third.next = fourth;
        fourth.next = fifth;
        fifth.next= sixth;*/

        System.out.println(reverseKGroup(first, 2));

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode output = null;
        ListNode reversed = null;
        while (head != null) {
            int i = k;
            ListNode start = head;
            ListNode end = start;
            while (i > 1 && head.next != null) {
                end.next = head.next;
                head = head.next;
                end = end.next;
                i--;
            }
            if (head != null) {
                head = head.next;
            }
            end.next = null;

            if (i == 1) {
                if (reversed == null) {
                    reversed = reverseLinkedList(start);
                } else {
                    while (reversed.next != null) {
                        reversed = reversed.next;
                    }
                    reversed.next = reverseLinkedList(start);
                }
            } else {
                if (reversed != null) {
                    while (reversed.next != null) {
                        reversed = reversed.next;
                    }
                    reversed.next = start;
                } else {
                    reversed = start;
                }
            }
            if (output == null) {
                output = reversed;
            }
        }


        return output;
    }

    public static ListNode reverseLinkedList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }


        return prev;
    }
}
