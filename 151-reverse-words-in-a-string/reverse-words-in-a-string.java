class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        //using string builder to modify the string and maintain some operarions 

       
        int left=0;
        int right=s.length()-1;
        while(right>=0)
        {
            while(right>=0 && s.charAt(right)==' ')
            {
                right--;
            }
            left=right;
            if(right<0)
            {
                break;
            }
            while(right>=0 && s.charAt(right)!=' ')
            {
                right--;
            }
            if(sb.isEmpty())
            {
                sb.append(s.substring(right+1,left+1));
            }
            else
            {
        
                sb.append(" "+s.substring(right+1,left+1));
            }
        }
        return sb.toString();

        
        
    }
}