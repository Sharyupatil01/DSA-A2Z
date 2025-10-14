public class ReverseString
{
    public static void main(String args[])
    {
        //way 1 
        // String str="hello";
        // String newStr="";
        // for(int i=str.length()-1;i>=0;i--)
        // {
        //     newStr=newStr+str.charAt(i);
        // }
        // System.out.println(newStr);

        //way 2 
        String str="hello";
        String newStr=new StringBuilder(str).reverse().toString();
        System.out.println(newStr);


    }
}