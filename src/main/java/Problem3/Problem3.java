package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;


public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if(list == null) {
            return;
        }
        int temp = list.val;
        if(list.next == null) {
            print.println(temp);
            return;
        }
        list = list.next;
        printListInReverse(list, print);
        print.println(temp);
    }
}
