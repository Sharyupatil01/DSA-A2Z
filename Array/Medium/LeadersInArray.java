package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String args[])
    {
        int arr[]={16,17,4,3,5,2};
        int max=arr[arr.length-1];
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                result.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(result);
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+" ");
        }
    }
}
