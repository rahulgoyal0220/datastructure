package LeetCode;

public class ReverseLinkedList2 {

    public static void main(String[] args) {
        ListNode l_1 = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        l_1.next = sec;
       // sec.next = third;
        //third.next = fourth;
        //fourth.next = fifth;

        System.out.println(reverseBetween(l_1, 1, 2));
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode begin = head;
        ListNode start = null;
        ListNode curr = null;
        ListNode prev = null;
        ListNode first = null;
        if (head != null && m != n) {
            while (head != null && (n > 0)) {
                while (m > 1 && head != null) {
                    start = head;
                    head = head.next;
                    m--;
                    n--;
                }
                curr = head;
                head = head.next;

                curr.next = prev;
                prev = curr;
                if (first == null) {
                    first = curr;
                }
                n--;
            }
            if (start == null && head == null) {
               return prev;
            } else if (start != null && head == null) {
                start.next = prev;
            } else if (start == null && head != null) {
                start = prev;
                first.next = head;
                return start;
            } else {
                start.next = prev;
                first.next = head;
            }
        } else {
            return head;
        }

        return begin;
    }

    public ListNode reverseBetween1(ListNode head, int m, int n) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode cur = dummyhead;
        ListNode lhead = null;
        for(int i = 0; i < m; i++) {
            lhead = cur;
            cur = cur.next;
        }
        ListNode pre = null;
        ListNode next = null;
        for(int j = m; j <= n; j++) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        ListNode ppp = pre;
        while(pre.next != null) {
            pre = pre.next;
        }
        if(pre.next == null) {
            pre.next = cur;
        }
        lhead.next = ppp;
        return dummyhead.next;
    }
}
