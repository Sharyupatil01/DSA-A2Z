package BasicsStriverSheet;

public class Prime1 {
    public static void main(String args[])
    {
        int n=29;
        int count=0;
        for(int i=0;i*i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
                if(i!=n/i)
                {
                    count++;
                }

            }
            if(count==2)
            {
               System.out.println("YES PRIME");
            }
            else{
                System.out.println("Not prime");
            }
            

        }
    }
}
