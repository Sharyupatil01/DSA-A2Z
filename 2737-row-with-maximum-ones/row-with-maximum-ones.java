class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] returning_array={0,0};
        int index=0;
        for(int[] row1 : mat)
        {
            Arrays.sort(row1);

           int first_occurrence=lowerbound(row1);
           if(first_occurrence==-1)
           {
               first_occurrence=0;
           }
           else
           {
               //Total ones would be all after first occurrence
               first_occurrence=row1.length-first_occurrence;
           }

           if( first_occurrence > returning_array[1])
           {
               returning_array[1]=first_occurrence;
               returning_array[0]=index;

           }
           index++;

        }
        return returning_array;







    }
    public int lowerbound(int[] arr)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low)+(high-low)/2;
            if(arr[mid]==1)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}