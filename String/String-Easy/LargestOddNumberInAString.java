public class LargestOddNumberInAString {
    public static void main(String args[])
    {
        String num="320872";
        for(int i=num.length()-1;i>=0;i--)
        {
            int digit=num.charAt(i)-'0';
            if(digit%2!=0)
            {
                System.out.println(num.substring(0,i+1));
                return;
            }
        }
        System.out.println("");
    }
}
