class Solution {
    public int reversePairs(int[] nums) {

        // Brute Approach -> O(N^2)
    /*
        There are many testcases to be handled , with this solution time complexity is lot more uglier 
        hence we need a approach to check if the comparison can be avoid or reject 
     

        when i was checking the question i found out that i and j positions needs to be maintain
        i should be always smaller than j 
        and that can automated just by merge sort -> no i<j check here the same saves 

     */

        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if ((long) nums[i] > 2L * nums[j]) {
        //             count++;
        //         }
        //     }
        // }
        // return count;


        if(nums==null || nums.length==0){return 0;}
        return mergeSort(nums,0,nums.length-1);




    }
    public int mergeSort(int[] nums, int left , int right)
    {
        if(left>=right)
        {
            return 0;
        }
        int mid=left+(right-left)/2;
        int count=0;
        count+=mergeSort(nums,left,mid);
        count+=mergeSort(nums,mid+1,right);
        count+=solve(nums,left,right,mid);

        merge(nums,left,mid,right);
        return count;

    }

    public int solve(int nums[] , int left , int right , int mid)
    {
        int count=0;
         int j=mid+1;
         for(int i=left;i<=mid;i++)
         {
              while(j<=right && (long) nums[i]>2L*nums[j])
              {
                j++;
              }
              count+=(j-(mid+1));
         }
         return count;

    }

    public void merge(int nums[] , int low , int mid , int high)
    {
        int temp[]=new int[high-low+1];

        int i=low;
        int j=mid+1;
        int  k=0;
        while(i<=mid && j<=high)
        {
            if(nums[i]<=nums[j])
            {
                 temp[k]=nums[i];
                 k++;
                 i++;
            }
            else
            {
                temp[k]=nums[j];
                k++;
                j++;
            }


        }
        while(i<=mid)
        {
            temp[k]=nums[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k]=nums[j];
            j++;
            k++;
        }
          
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }

    }
}
