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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode after = head;
        ListNode before = new ListNode(0);
        before.next = head;
        ListNode finalList = before;
        while(after != null && after.next != null){
            if(after.val == after.next.val){
                while(after.next != null && after.val == after.next.val){
                    after = after.next;
                }
                after = after.next;
                before.next = after;
            } else {
                after = after.next;
                before = before.next;
            }
        }
        return finalList.next;
    }
}