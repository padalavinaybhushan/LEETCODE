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
    public ListNode partition(ListNode head, int x) {
        ListNode dum1 = new ListNode(1),dum2 = new ListNode(2);
        ListNode pres = head,ptr1=dum1,ptr2=dum2;           
        ListNode tem = head;
        while(tem != null){
            if(tem.val < x){
                ptr1.next = tem;
                ptr1 = ptr1.next;
            }
            else{
                ptr2.next = tem;
                ptr2 =  ptr2.next;
            }
            tem = tem.next;
        }
        ptr1.next = dum2.next;
        ptr2.next=null;
        return dum1.next;
        
    }
}