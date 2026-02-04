class Solution {
    public int myAtoi(String s) {
        if(s==null)
        {
            return 0;
        }
        s=s.trim(); // remove the leading and trailing zeroes 

        if(s.length()==0)
        {
            return 0;
        }

        int sign=+1;//they told to assume , if the sign is not present consider +ive 
        long ans=0;
        int i=0;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        
        if(s.charAt(0)=='-')
        {
            sign=-1;//the negative number sign is toggled to negative -1
        }

        if(s.charAt(0)=='-' || s.charAt(0)=='+')
        {
           i=1;//if any sign is present then i=1 , second index start
        }
        else
        {
            i=0; // if no any present , assume its +ve and start with first index 
        }

        while(i<s.length())
        {
            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i)))
            {
                break;
            }
            ans=ans*10+s.charAt(i)-'0';
            if(sign==-1 && -1*ans<min)
            {
                return min;
            }
            if(sign==1 && 1*ans>max)
            {
                return max;
            }
            i++;
        }
        return (int)ans*sign;


    }
}