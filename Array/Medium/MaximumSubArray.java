package Array.Medium;
import java.util.*;


public class MaximumSubArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum=Math.max(sum+arr[i],arr[i]);
            max=Math.max(max,sum);
        }
        System.out.println("Result:"+ max);
    }
}
