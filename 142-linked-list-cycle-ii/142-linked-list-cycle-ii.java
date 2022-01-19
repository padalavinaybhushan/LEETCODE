/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode tem = head;
        ListNode prev = null;
        while(tem != null)
        {
            if(hs.contains(tem))
            {
                return tem;
            }
            else
            {
                hs.add(tem);
                tem = tem.next;
            }
        }
        return null;
        
    }
}