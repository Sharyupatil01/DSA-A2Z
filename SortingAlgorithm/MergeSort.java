package SortingAlgorithm;

public class MergeSort {

    public static void merge(int arr[],int start,int mid,int end)
    {
        int n1=mid-start+1;
        int n2=end-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i]=arr[start+1];
        }
        for(int j=0;j<0;j++)
        {
            right[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];

            }
            else{
                arr[k++]=right[j++];
            }

        }
        while(i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2)
        {
            arr[k++]=right[j++];
        }

    }
  public static void mergesort(int []arr,int start,int end)
  {
    if(start<=end)
    {
        int mid=end+(start-end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
  }
  public static void main(String args[])
  {
       int arr[]={1,3,2,4,5,6,7,8,9,10};
       int start=0;
       int end=arr.length-1;
       mergesort(arr,start,end);
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
}
   

}
