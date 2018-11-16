package LeetCode;

public class MergeKSortedList {

    public static void main(String[] args) {
        ListNode l_1 = new ListNode(-1);
        ListNode sec = new ListNode(4);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(7);
        l_1.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode l_2 = new ListNode(-3);
        ListNode seca = new ListNode(6);
        ListNode thirda = new ListNode(8);
        ListNode fourtha = new ListNode(9);
        ListNode fiftha = new ListNode(11);
        l_2.next = seca;
        seca.next = thirda;
        thirda.next = fourtha;
        fourtha.next = fiftha;


        ListNode l_3 = new ListNode(-2);
        ListNode secb = new ListNode(8);
        ListNode thirdb = new ListNode(12);
        ListNode fourthb = new ListNode(14);
        ListNode fifthb = new ListNode(15);
        l_3.next = secb;
        secb.next = thirdb;
        thirdb.next = fourthb;
        fourthb.next = fifthb;

        ListNode[] listArraya = {l_1, l_2, l_3};

        System.out.println(mergeKLists(listArraya));
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode start = new ListNode(-1000);
        ListNode tmp = start;
        ListNode priv = start;
        int listCount = lists.length;
        int i = 0;
        int allNull = 0;
        while (i < listCount) {
            if (lists[i] != null) {
                int val = lists[i].val;
                if (tmp != null && tmp.val == -1) {
                    tmp.next = new ListNode(val);
                    tmp = tmp.next;
                } else {
                    tmp = start;
                    while (tmp != null) {
                        if (tmp.val > val) {
                            break;
                        } else {
                            priv = tmp;
                            tmp = tmp.next;
                        }
                    }
                    ListNode newNode = new ListNode(val);
                    priv.next = newNode;
                    newNode.next = tmp;
                }
                allNull = 0;
                lists[i] = lists[i].next;
            } else {
                allNull++;
            }
            i++;
            if (i >= listCount && allNull == listCount) {
                break;
            } else if (i >= listCount && allNull != listCount) {
                i = 0;
                allNull = 0;
            }
        }

        return start.next;
    }
}
