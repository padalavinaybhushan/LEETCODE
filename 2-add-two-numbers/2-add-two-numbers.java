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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode num1 = l1,num2 = l2;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry =0;
        while(num1 != null && num2 != null)
        {
            int t1 = num1.val;
            int t2 = num2.val;
            int k = t1+t2+carry;
            carry = ((k - (k%10))!=0)?1:0;
            ans.add(k%10);
            num1 = num1.next;
            num2 = num2.next;
        }
        while(num1 != null)
        {
            int t1 = num1.val;
            int k = t1 + carry;
            carry = ((k - (k%10))!= 0)?1:0;
            ans.add(k%10);
            num1 = num1.next;
        }
        while(num2 != null)
        {
            int t1 = num2.val;
            int k = t1 + carry;
            carry = ((k - (k%10))!= 0)?1:0;
            ans.add(k%10);
            num2 = num2.next;
        }
        if(carry != 0)
        {
            ans.add(carry);
        }
        int size= ans.size();
        ListNode head = null;
        ListNode prev = null;
        for(int i=0;i<size;i++)
        {
            if(i == 0)
            {
                head = new ListNode(ans.get(0));
                prev = head;
            }
            else
            {
                ListNode te = new ListNode(ans.get(i));
                prev.next = te;
                prev = te;
            }
        }
        prev.next = null;
        return head;
    }
}