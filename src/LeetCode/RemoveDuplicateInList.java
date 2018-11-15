package LeetCode;

public class RemoveDuplicateInList {


    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(2);
        ListNode sixth = new ListNode(2);

        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.println(deleteDuplicates(first));

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode start = null;
        ListNode curr = head;
        ListNode tmp = null;
        int i = 0;
        if (curr != null) {
            while (curr != null) {
                while (curr.next != null) {
                    if (curr.val == curr.next.val) {
                        curr = curr.next;
                        i++;
                    } else {
                        break;
                    }
                }
                if (i == 0) {
                    if (tmp == null) {
                        tmp = new ListNode(curr.val);
                        start = tmp;
                    } else {
                        tmp.next = new ListNode(curr.val);
                        tmp = tmp.next;
                    }
                }
                i = 0;
                curr = curr.next;
            }
        }


        return start;
    }
}

