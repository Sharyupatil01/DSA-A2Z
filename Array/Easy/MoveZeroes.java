package Array.Easy;

public class MoveZeroes {
    public static void main(String args[])
    {
        int arr[]={0,1,0,3,12};
        int i=0;
        int j=0;
        while(j<arr.length)
        {
            if(arr[j]!=0)
            {
                swap(arr,i,j);
                i++;
            }
            j++;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    
    
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
