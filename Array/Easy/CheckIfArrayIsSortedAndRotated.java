package Array.Easy;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String args[])
    {
        int arr[]={3,4,5,1,2};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[(i+1)%arr.length])
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.println("Array is not sorted and rotated");
        }
        else
        {
            System.out.println("Array is sorted and rotated");
        }
    }
}
//time complexity is O(n)
//space complexity is O(1)