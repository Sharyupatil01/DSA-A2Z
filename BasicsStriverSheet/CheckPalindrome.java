package BasicsStriverSheet;

public class CheckPalindrome {
    public static void main(String args[])
    {
        int n=121;
        int original=n;
        int reversed=0;
        while(n>0)
        {
            int digit=n%10;
            n=n/10;
            reversed=reversed*10+digit;
        }
        if(original==reversed)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
