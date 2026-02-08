class Solution {
    public int maxProduct(int[] nums) {
        int currentmin=nums[0];
        int currentmax=nums[0];
        int global=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int min=currentmin;
            int max=currentmax;
            currentmin=Math.min(Math.min(min*nums[i],max*nums[i]),nums[i]);
            currentmax=Math.max(Math.max(min*nums[i],max*nums[i]),nums[i]);
            global=Math.max(currentmax,global);
        }
        return global;
    }
}