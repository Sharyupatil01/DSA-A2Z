class Solution {
    public int minOperations(String s) {
       String s1="";
       String s2="";
       int count1=0;
       int count2=0;
       for(int i=0;i<s.length();i++)
       {
         if(i%2==0)
         {
            s1+="0";
            s2+="1";
         }
         else
         {
            s1+="1";
            s2+="0";
         }
       } 

       for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i)!=s1.charAt(i))
          {
            count1++;
          }
          if(s.charAt(i)!=s2.charAt(i))
          {
            count2++;
          }
       }
       return Math.min(count1,count2);

    }
}