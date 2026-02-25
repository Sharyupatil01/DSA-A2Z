class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> list=new ArrayList<>(hash.keySet());

        Collections.sort(list,(a,b)->{
            if(hash.get(a).equals(hash.get(b)))
            {

                return b-a;
            }
            return hash.get(a)-hash.get(b);
        });
        ArrayList<Integer> ans=new ArrayList<>();

        for(Integer in : list)
        {
            int count=hash.get(in);
            while(count>0)
            {
                ans.add(in);
                count--;
            }
        }
        int result[]=new int[nums.length];
        for(int i=0;i<result.length;i++)
        {
            result[i]=ans.get(i);
        }
        return result;
        

    }
}