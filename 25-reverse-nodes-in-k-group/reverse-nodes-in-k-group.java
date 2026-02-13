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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevgroupend=dummy;
        while(true)
        {
            ListNode kth=prevgroupend;
            for(int i=0;i<k && kth!=null ;i++)
            {
                kth=kth.next;
            }
            if(kth==null)
            {
                break;
            }
            ListNode groupstart=prevgroupend.next;
            ListNode nextgroupstart=kth.next;
            ListNode prev=nextgroupstart;
            ListNode curr=groupstart;

            while(curr!=nextgroupstart)
            {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            prevgroupend.next=kth;
            prevgroupend=groupstart;



        }
        return dummy.next;
    }
}