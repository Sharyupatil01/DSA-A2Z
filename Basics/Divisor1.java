package BasicsStriverSheet;

public class Divisor1 {
    public static void main(String args[])
    {
        int n=28;
       for(int i=0;i*i<=n;i++)
       {
        if(n%i==0)
        {
            System.out.println(i);
            if(i!=n/i)
            {
                System.out.println(n/i);
            }
        }
       }
       
    }
}
