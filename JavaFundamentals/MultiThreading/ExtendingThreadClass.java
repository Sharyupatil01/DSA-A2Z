
class smallExample extends Thread{
    private String  threadname;

    smallExample(String name)
    {
        this.threadname=name;
    }
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(threadname + " " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

}



public class ExtendingThreadClass {
    public static void main(String args[])
    {
       smallExample t1=new smallExample("Thread 1");
       smallExample t2=new smallExample("Thread 2");
       smallExample t3=new smallExample("Thread 3");
       t1.start();
       t2.start();
       t3.start();
       

    }
}
