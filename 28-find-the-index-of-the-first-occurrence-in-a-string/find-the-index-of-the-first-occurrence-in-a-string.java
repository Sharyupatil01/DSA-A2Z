class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();

        if(n>m)
        {
            return -1;
        }

        int i,j;
        int p=0;
        int t=0;
        int h=1;
        int d=256;
        int q=31;

        char [] pat1=needle.toCharArray();
        char [] pat2=haystack.toCharArray();

        //Calculate the hash value of both needle  , length of(needle.length())
        //-> for haystack 


        // the valye of h would be "pow(d, n-1)%q" 
        for( i=0;i<n-1;i++)
        {
            h=(h*d)%q;
        }

        for( i=0;i<n;i++)

        {
            p=(d*p+pat1[i])%q;
            t=(d*t+pat2[i])%q;
        }

        for( i=0;i<=m-n;i++)
        {
            //check the hash value of current window of text 
            // pattern is matching , 
            //check for the characater one by one 
                if(p==t)
                {
                     for( j=0;j<n;j++)
                     {
                        if(pat2[i+j]!=pat1[j])
                        {
                            break;
                        }
                     }

                     //if the p==t and all the value of character matches to pat1 and pat2 
                     if(j==n)
                     {
                        return i;
                     }

                }

                //calcaulte the hash value of next window of text : remove 
                //leading digit value & add trailing digit 

                if(i<m-n)
                {
                    t=(d*(t-pat2[i]*h)+pat2[i+n])%q;

                    if(t<0)
                    {
                        t=t+q;
                    }
                }


        }
        return -1;




    }
}