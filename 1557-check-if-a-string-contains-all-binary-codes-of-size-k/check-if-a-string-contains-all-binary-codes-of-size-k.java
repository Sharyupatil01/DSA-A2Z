class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total=1<<k;
        HashSet<String> hash=new HashSet<>();
        for(int i=k;i<=s.length();i++)
        {
            String str=s.substring(i-k,i);
            if(!hash.contains(str))
            {
                hash.add(str);
            }
        }
        if(hash.size()==total)
        {
            return true;
        }
        return false;
    }
}