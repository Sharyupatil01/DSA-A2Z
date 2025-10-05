public class MergeTwoSortedArray {
    public static void main(String args[])
    {
        int arr[]={1,3,5,7};
        int arr1[]={2,4,6,8};
        int mergedArray[]=new int[arr.length+arr1.length];
        int i=0;
        int j=0;
        for(int k=0;k<mergedArray.length;k++)
        {
            if(i<arr.length && j<arr1.length)
            {
                if(arr[i]<arr1[j])
                {
                    mergedArray[k]=arr[i];
                    i++;
                }
                else{
                    mergedArray[k]=arr1[j];
                    j++;
                }
            }
            else if (i<arr.length)
            {
                mergedArray[k]=arr[i];
                i++;
            }
            else{
                mergedArray[k]=arr1[j];
                j++;
            }
        }
        for(int k=0;k<mergedArray.length;k++)
        {
            System.out.print(mergedArray[k]+" ");
        }
    }
}
