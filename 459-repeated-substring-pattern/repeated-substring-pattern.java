class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String finall = s+s;
        String doublee=finall.substring(1,finall.length()-1);
        return doublee.contains(s);

    }
}