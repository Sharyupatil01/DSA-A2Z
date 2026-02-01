class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        {
            return s;
        }
        String result="";
        for(int i=1;i<s.length();i++)
        {
            int left=i;
            int right=i;
            while(s.charAt(right)==s.charAt(left))
            {
                right++;
                left--;
                if(left==-1 || right==s.length())
                {
                    break;
                } 
            }
            String palindrome=s.substring(left+1,right);
            if(result.length()<palindrome.length())
            {
                result=palindrome;
            }

            left=i-1;
            right=i;
            while(s.charAt(left)==s.charAt(right))
            {
                right++;
                left--;
                 if(left==-1 || right==s.length())
                {
                    break;
                } 
            }
            palindrome=s.substring(left+1,right);
            if(result.length()<palindrome.length())
            {
                result=palindrome;
            }
        }
        return result;


    }
}