package BasisMaths;

public class Armstrong {
    public static void main(String args[])
    {
        // int n=153;
        // int original=n;
        // int sum=0;
        // while(n>0)
        // {
        //     int rem=n%10;
        //     sum=sum+rem*rem*rem;
        //     n=n/10;

        // }
        // if(original==sum)
        // {
        //     System.out.println("Armstrong number");
        // }
        // else
        // {
        //     System.out.println("Not an Armstrong number");
        // }

        int n=153;
        String str=Integer.toString(n);
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int digit=ch-'0';
            sum+=(int)Math.pow(digit,str.length());
        }
        if(sum==n)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }


    }
}
