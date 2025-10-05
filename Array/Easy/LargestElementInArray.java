package Array.Easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestElementInArray {
    public static void main(String args[])
    {
        int arr[]={1,10,92,5};
        // int largest=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>largest)
        //     {
        //         largest=arr[i];
        //     }
        // }
        // System.out.println("Largest element is :" + largest);

        //it can also be solved by sorting and priority queue


        // Arrays.sort(arr);
        // System.out.println("Largest element is :" + arr[arr.length-1]);

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        System.out.println("Largest element is :" + pq.peek());



    }
}
