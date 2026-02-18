class Solution {
    public int findLUSlength(String a, String b) {
        int n=a.length();
        int m=b.length();
        if(a.contains(b) && b.contains(a))
        {
            return -1;
        }
        if(n>m)
        {
            return n;
        }
        else
        {
            return m;
        }
    }
}