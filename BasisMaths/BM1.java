package BasisMaths;

public class BM1 {
    public static void main(String args[])
    {
        

        //count digits in a number 
        int z=1234;
        int count=0;
        while(z>0)
        {
            z=z/10;
            count++;
        }
        System.out.println(count);

        //reverse a number 
        int n=1234;
        System.out.println("Original number " + n);
        int rev=0;
        int x=rev;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println("Reverse number is :" + rev);

        //check palindrome number
        int num=121;
        int original=num;
        int reverse=0;
        while(num>0)
        {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;

        }
        if(original==reverse)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }

        //Gcd 
        int a=12;
        int b=9;
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }

           
        }
         if(a==0)
            {
                System.out.println("GCD is " + b);
            }
            else 
            {
                System.out.println("GCD is " + a);
            }

            

    }
}
