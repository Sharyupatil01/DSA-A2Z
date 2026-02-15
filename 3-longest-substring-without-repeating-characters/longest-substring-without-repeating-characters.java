class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash=new HashSet<>();
        
      int right=0;
      int left=0;
      int maxlen=0;
      while(left<s.length())
      {
          if(hash.contains(s.charAt(left)))
          {
            while(hash.contains(s.charAt(left)))
            {
                hash.remove(s.charAt(right));
                right++;
            }


          }
          else
          {
            hash.add(s.charAt(left));
            left++;
          }
          maxlen=Math.max(maxlen,left-right);

      }
      return maxlen;

    }
}