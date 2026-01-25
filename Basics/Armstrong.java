package BasicsStriverSheet;

public class Armstrong {
    public static void main(String args[])
    {
         int n=123;
        int original=n;
        int sum=0;
        int res=0;
        while(n>0)
        {
            int digit=n%10;
            n=n/10;
            sum=digit*digit*digit;
            res=res+sum;
        }
        if(original==res)
        {
            System.out.println("Armstrong number");

        }
        else{
            System.out.println("not an armstronger number");
        }

    }
}
