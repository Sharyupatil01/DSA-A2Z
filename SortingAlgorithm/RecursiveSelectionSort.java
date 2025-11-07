public class RecursiveSelectionSort {
    public static void main(String args[])
    {
        int arr[]={64,25,12,22,11};
        int n=arr.length;
        selectionsort(arr,0);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionsort(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return;
        }
        int swaps=0;
        int min_index=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min_index])
            {
                min_index=j;
                swaps++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp;
        
        selectionsort(arr,i+1);
        System.out.println("Number of swaps: " + swaps);
    }
}

// Time complexity 
// Best Case: O(n^2)
// Average Case: O(n^2)
// Worst Case: O(n^2)

// Space Complexity: O(n) due to recursion stack
// Stable: No
// In-Place: Yes
