import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String args[])
    {
        String arr[]={"flower","flow","flight"};//"fl"
       Arrays.sort(arr);
       String s1=arr[0];
       String s2=arr[arr.length-1];
       int count=0;
       for(int i=0;i<Math.min(s1.length(),s2.length());i++)
       {
        if(s1.charAt(i)==s2.charAt(i))
        {
           count++;
        }
        else{
            break;
        }
       
       }
       System.out.println(s1.substring(0,count));
    }
}
