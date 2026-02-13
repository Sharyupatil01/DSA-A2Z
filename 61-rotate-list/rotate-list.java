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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        ListNode temp=head;
        int count=1;
        //Reach the last node 
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        //make it circular linked list 
        temp.next=head;
        
        //steps we need to traversal 
        k=k%count;
        int steps=count-k;

        ListNode newtail=head;
        for(int i=1;i<steps;i++)
        {
           newtail=newtail.next;
        }
        //reach exactly one step before rotation 
        ListNode newHead=newtail.next;
        newtail.next=null;

        return newHead;



    }
}