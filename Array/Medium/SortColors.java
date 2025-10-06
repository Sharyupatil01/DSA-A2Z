package Array.Medium;

public class SortColors {
    public static void main(String args[])
    {
        int arr[]={2,0,2,1,1,0};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low+=1;
                mid+=1;
            }
            else if(arr[mid]==2)
            {
                swap(arr,high,mid);
                high=high-1;

            }
            else {
                mid+=1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[] , int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}
