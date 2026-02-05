class Solution {
    public int longestOnes(int[] arr, int k) {
        // Window condition:
// zeros <= k

// Expand with right
// Shrink with left when condition breaks
       
       int count=0;
       int i=0;
       int max=0;
       for(int j=0;j<arr.length;j++)
       {
        if(arr[j]==0)
        {
            count++;
        }
        if(count>k)
        {
            if(arr[i]==0)
            {
                count--;
            }
            i++;
        }
        if(count<=k)
        {
            max=Math.max(j-i+1,max);
        }
       }
       return max;
    }
}