/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode solve(ListNode headA,ListNode headB)
    {
        while(headA != null || headB != null)
        {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tem = headA;int len1=0;
        while(tem != null) 
        {
            len1++;
            tem = tem.next;
        }
        tem = headB;
        int len2 = 0;
        while(tem != null)
        {
            len2++;
            tem = tem.next;
        }
        if(len1 == len2)
        {
            return solve(headA,headB);
        }
        else
        {
            if(len1>len2)
            {
                int count=len1-len2;
                tem = headA;
                while(count-->0)
                {
                    tem = tem.next;
                }
                return solve(tem,headB);
            }
            else 
            {
                int count=len2-len1;
                tem = headB;
                while(count-->0)
                {
                    tem = tem.next;
                }
                return solve(headA,tem);
            }
        }
    }
}