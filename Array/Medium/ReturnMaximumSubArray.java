package Array.Medium;

public class ReturnMaximumSubArray {
    public static void main(String args[])
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        int max=arr[0];
        int sum=arr[0];
        int start=0;
        int end=0;
        int s=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>sum+arr[i])
            {
                sum=arr[i];
                s=i;
            }
            else{
                sum=sum+arr[i];
            }

            if(sum>max)
            {
                max=sum;
                start=s;
                end=i;
            }
        }
        System.out.println("Maximum Subarray Sum: "+ max);
        System.out.print("Subarray: ");
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
