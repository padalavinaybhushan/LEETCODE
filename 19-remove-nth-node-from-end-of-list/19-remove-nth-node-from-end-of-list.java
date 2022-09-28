/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int t = n;
        ListNode tem = head;
        while(t-- > 0)
        {
            tem = tem.next;
        }
        ListNode t1 = head;
        while(tem != null && tem.next != null )
        {
            tem = tem.next;
            t1 = t1.next;
        }
        if(t1 == head && tem == null)
        {
            return t1.next;
        }
        t1.next = t1.next.next;
        return head;
    }
}