package LeetCode;

public class MergeList {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

         first.next = sec;
        sec.next = third;
      /*  third.next = fourth;
        fourth.next = fifth;*/

        ListNode remove = removeNthFromEnd(first, 3);
        System.out.println("List:  " + remove);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head != null) {
            ListNode pointer1 = head;
            ListNode pointer2 = head;
            ListNode oneBefore = null;
            if(head.next == null  && n ==1) {
                return null;
            }
            while (pointer2.next != null) {
                if (n > 1) {
                    pointer2 = pointer2.next;
                    n--;
                } else {
                    oneBefore = pointer1;
                    pointer1 = pointer1.next;
                    pointer2 = pointer2.next;
                }
            }

            if(oneBefore == null) {
                head = pointer1.next;
            } else {
                oneBefore.next= pointer1.next;
            }

        }
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

