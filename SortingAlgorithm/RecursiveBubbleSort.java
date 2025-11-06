class RecursiveBubbleSort 
{
    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        bubblesort(arr,n);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubblesort(int arr[], int n)
    {
        if(n==1)
        {
            return;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubblesort(arr,n-1);

    }
}