class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();

        for(int i=left;i<=right;i++)
        {
           if(solve(i))
           {
            ans.add(i);
           }
        }
        

        return ans;

    }

    public boolean solve(int num)
    {
        int no=num;
        while(num!=0)
        {
            int remain=num%10;
            if(remain==0)
            {
                return false;
            }
            if(no%remain!=0)
            {
                return false;
            }
            num=num/10;
        }
        return true;
    }

}