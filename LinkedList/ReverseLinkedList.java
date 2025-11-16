package LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String args[])
    {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        ListNode reversedHead=reverseList(head);
        ListNode curr=reversedHead;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }

        
    }
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
