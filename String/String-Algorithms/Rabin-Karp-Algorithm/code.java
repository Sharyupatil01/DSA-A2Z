

public class code {
    //pattern matching using rabin karp algorithm
    public static void main(String args[])
    {
        String text="ABABDABACDABABCABAB";
        String pattern="ABABCABAB";
        int m=pattern.length();
        int n=text.length();
        int p=0; //hash value for pattern
        int t=0; //hash value for text
        int d=256; //number of characters in input alphabet
        int q=101; //a prime number
        int h=1;
        for(int i=0;i<m-1;i++)
        {
            h=(h*d)%q;
        }
        for(int i=0;i<m;i++)
        {
            p=(d*p + pattern.charAt(i))%q;
            t=(d*t + text.charAt(i))%q;
        }
        for(int i=0;i<=n-m;i++)
        {
            if(p==t)
            {
                int j;
                for(j=0;j<m;j++)
                {
                    if(text.charAt(i+j)!=pattern.charAt(j))
                    {
                        break;
                    }
                }
                if(j==m)
                {
                    System.out.println("Pattern found at index "+i);
                }
            }
            if(i<n-m)
            {
                t=(d*(t - text.charAt(i)*h) + text.charAt(i+m))%q;
                if(t<0)
                {
                    t=t+q;
                }
            }
        }
        System.out.println("Pattern matching completed.");

    }


}
