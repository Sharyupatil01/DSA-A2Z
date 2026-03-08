class Solution {
    public int countTriples(int n) {
        HashSet<Integer> hash=new HashSet<>();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            hash.add(i*i);
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(hash.contains(i*i+j*j))
                {
                    count++;
                }
            }
        }
        return count*2;
    }
}