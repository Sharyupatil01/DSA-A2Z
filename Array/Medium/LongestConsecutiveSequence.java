package Array.Medium;

import java.util.HashSet;

public class LongestConsecutiveSequence{
    public static void main(String args[])
    {
        int arr[]={0,3,7,2,5,8,4,6,1,0};
        if(arr.length==0)
        {
            System.out.println("Result"+ 0);
        }
        int longest=1;
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hash.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!hash.contains(arr[i]-1))
            {
                int j=arr[i]+1;
                while(hash.contains(j))
                {
                    j=j+1;
                }
                longest=Math.max(longest,j-arr[i]);
            }
        }
        System.out.println("Result "+ longest);
    }
}