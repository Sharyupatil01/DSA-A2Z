import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String args[])
    {
       stack s=new stack();
       s.push(1);
       s.push(20);
       s.push(30);
       System.out.println("Top of the stack before deleting any element " + s.top());
       System.out.println("Size of the stack before deleting any element " + s.size());
       System.out.println("The element deleted is " + s.pop());
       System.out.println("Size of the stack after deleting an element " + s.size());
       System.out.println("Top of the stack after deleting an element " + s.top());
    }
}
class stack{
    Queue<Integer> q=new LinkedList<>();
    void push(int x)
    {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
    }
    int pop()
    {
        return q.remove();
    }
    int top()
    {
        return q.peek();
    }
    int size()
    {
      return q.size();
    }
}
