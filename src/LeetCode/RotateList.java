package LeetCode;

public class RotateList {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println(rotateRight(first, 3));

    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode start = head;
        ListNode curr = null;
        ListNode prev = null;
        if (head != null) {
            while (head != null) {
                while (k > 0 && head != null) {
                    head = head.next;
                    if (head == null) {
                        head = start;
                    }
                    k--;
                }
                if (curr == null) {
                    curr = start;
                } else {
                    curr = curr.next;
                }
                prev = head;
                head = head.next;
            }

            //rotate list
            prev.next = start;
            if (curr != null) {
                start = curr.next;
                curr.next = null;
            }

        }

        return start;
    }
}
