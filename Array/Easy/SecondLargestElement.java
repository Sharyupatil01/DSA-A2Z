package Array.Easy;

public class SecondLargestElement {
    public static void main(String args[])
    {

        int arr[]={1,90,43,23};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest)

            {
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest element is:"+ secondLargest);


        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // int arr[]={1,90,43,23};
        // for(int i=0;i<arr.length;i++)
        // {
        //     pq.add(arr[i]);
        // }
        // pq.poll();
        // System.out.println("Second largest element is:"+ pq.poll());
        
    }
}
