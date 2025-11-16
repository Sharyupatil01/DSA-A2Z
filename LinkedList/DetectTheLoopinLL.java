
class ListNode1
{
    int data;
    ListNode1 next;
    ListNode1(int d)
    {
        data=d;
        next=null;
    }
}

class DetectTheLoopinLL
{
    public static void main(String args[])
    {
        ListNode1 head=new ListNode1(1);
        head.next=new ListNode1(2);
        head.next.next=new ListNode1(3);
        head.next.next.next=new ListNode1(4);
        head.next.next.next.next=new ListNode1(5);
        //Creating a loop for testing
        head.next.next.next.next.next=head.next;

        boolean hasLoop=detectLoop(head);
        System.out.println("Linked List has loop: "+hasLoop);
    }
    public static boolean detectLoop(ListNode1 head)
    {
        ListNode1 slow=head;
        ListNode1 fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}