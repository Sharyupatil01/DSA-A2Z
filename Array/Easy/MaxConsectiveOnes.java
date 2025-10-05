public class MaxConsectiveOnes {
    public static void main(String args[])
    {
        int count=0;
        int maxCount=0;
        int nums[]={1,1,0,1,1,1};
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else{
                count=0;
            }
            maxCount=Math.max(maxCount,count);
        }
        System.out.println("Max Consective Ones are "+maxCount);

    }
}
