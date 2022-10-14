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
    public ListNode deleteMiddle(ListNode head) {
        ListNode node = head;
        int n =0;
        while(node != null)
        {
            n++;
            node = node.next;
        }
        int remove = (n%2 == 0)?((int)(n/2)):((int)(n/2));
        node = head;
        int count=0;
        ListNode prev = head;
        if(n == 1)
        {
            head = null;
            return head;
        }
        while(node != null)
        {
            if(remove == count)
            {
                prev.next = node.next;
                return head;
            }
            prev = node;
            node = node.next;
            count++;
        }
        return head;
        
    }
}