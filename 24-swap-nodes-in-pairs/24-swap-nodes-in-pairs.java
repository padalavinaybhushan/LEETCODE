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
    public ListNode swapPairs(ListNode head) {
        ListNode tem = head;
        LinkedHashSet<ListNode> hs = new LinkedHashSet<>();
        int  ans =0;
        while(tem != null)
        {
            ans++;
            if((ans&1) == 1)
            {
                hs.add(tem);
            }
            tem = tem.next;
        }
        if(ans ==0 || ans == 1)
        {
            return head;
        }
        boolean flag = true;
        ListNode vin = null;
        ListNode prev = null;
        int size = hs.size();
        int count=1;
        for(ListNode curr : hs)
        {
            if(((ans&1) == 1) && (count==size))
            {
                break;
            }
            count++;
            if(flag)
            {
                prev = curr;
            }
            ListNode sec = curr.next;
            curr.next = sec.next;
            sec.next = curr;
            if(!flag)
                prev.next = sec;
            
            if(flag)
            {
                flag = false;
                vin = sec;
                prev = curr;
            }
            prev = curr;
        }
        return vin;
    }
}