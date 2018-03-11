import Others.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static ListNode getTailNode(ListNode head){
        ListNode newList = new ListNode(-1, null);
        while(head != null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode.printList(l1);
        System.out.println();
        ListNode.printList(getTailNode(l1));
    }
}
