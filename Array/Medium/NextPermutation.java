package Array.Medium;

public class NextPermutation {
    public static void main(String args[])
    {
        int arr[]={4,3,1};
        int index1=-1;
        // maintained to track the first element to swap 
        int index2=-1;
        //maintained to track the second element to swap
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index1=i;
                break;
            }
            if(index1==-1)
            {
                reverse(arr,0,arr.length-1);
            }
            else{
                for(int j=arr.length-1;j>=0;j--)
                {
                    if(arr[j]>arr[index1])
                    {
                          index2=j;
                          break;
                    }
                }
                swap(arr,index1,index2);
                reverse(arr,index1+1,arr.length-1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
