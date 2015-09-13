/*

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order 
and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
*/

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode l3 = new ListNode(0);
        ListNode n = l3;
        int carry=0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if(sum >= 10) {
                carry=1;
                sum -= 10;
            }
            else
                carry=0;
            n.next = new ListNode(sum);
            n = n.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int sum = l1.val + carry;
            if(sum >= 10) {
                carry=1;
                sum -= 10;
            }
            else
                carry=0;
            n.next = new ListNode(sum);
            n = n.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum = l2.val + carry;
            if(sum >= 10) {
                carry=1;
                sum -= 10;
            }
            else
                carry=0;
            n.next = new ListNode(sum);
            n = n.next;
            l2 = l2.next;
        }
        if(carry == 1) {
            n.next = new ListNode(1);
            n = n.next;
        }
        return l3.next;
    }
}