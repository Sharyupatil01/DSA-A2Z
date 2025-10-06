package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[])
    {
        int arr[]={1,2,4,5,6};
        int target=7;
        // Arrays.sort(arr);
        // int left=0;
        // int right=arr.length-1;
        // int sum=arr[left]+arr[right];
        // if(sum==target)
        // {
        //     System.out.println(arr[left]+" "+arr[right]);
        // }
        // else if(sum<target)
        // {
        //     right--;
        // }
        // else if (sum > target)
        // {
        //     left++;
        // }

        /*  Method 2 to Solve it using hashing */
        Map<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int rem=target-arr[i];
            if(hash.containsKey(rem))
            {
                System.out.println(arr[i]+" "+rem);

            }
            else{
                hash.put(arr[i],i);
            }
        }
        
        

    }
    
}
