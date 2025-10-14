public class OneStringIsRotationOfAnother {
    public static void main(String args[])
    {
        String str1="ABCD";
        String str2="BCDA";
        if(str1.length()!=str2.length())
        {
            System.out.println("NO");
        }
        String concate=str1+str1;
        if(concate.contains(str2))
        {
            System.out.println("YES");
        }
    }
}
