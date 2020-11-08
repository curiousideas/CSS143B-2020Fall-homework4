package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        int count = 1;
        if (head == null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode prev = head;

        while(cur != null) {
            cur = cur.next;
            count++;
            if(cur == null) {
                break;
            }
            cur = cur.next;
            count++;
            prev = prev.next;
        }

        ListNode ret = prev.next;
        prev.next = null;
        if (count % 2 == 1) {
            return null;
        }
        return ret;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {

        ListNode current = new ListNode(0);
        ListNode tempHead = current;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return tempHead.next;
    }
}