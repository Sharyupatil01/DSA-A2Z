How Rabin-Karp Algorithm Works?

Calculate the hashCode of pattern to be searched
Calculate the hashCode of every susbtring of length same as pattern from given text (Sliding window)
Check which window's hashCode matches pattern's hashCode
Compare characters of both strings
What is Rolling Hash?
Rolling hash is used to prevent rehashing the whole string while calculating hash values of the substrings of a given string. In rolling hash,the new hash value is rapidly calculated given only the old hash value. Using it, two strings can be compared in constant time.

class Solution {
    public int strStr(String haystack, String needle) {
        int M = needle.length(); 
        int N = haystack.length();
		
		 if(M>N)return -1;
		
        int i, j; 
        int p = 0; // hash value for needle 
        int t = 0; // hash value for haystack 
        int h = 1;
        int d= 256; // number of characters in the input alphabet 
        int q= 31; //a prime number

        char[] pat=needle.toCharArray();
        char[] txt=haystack.toCharArray();
        // The value of h would be "pow(d, M-1)%q" 
        for (i = 0; i < M - 1; i++) 
            h = (h * d) % q; 

        // Calculate the hash value of pattern and first 
        // window of text 
        for (i = 0; i < M; i++) { 
            p = (d * p + pat[i]) % q; 
            t = (d * t + txt[i]) % q; 
        } 

        // Slide the pattern over text one by one 
        for (i = 0; i <= N - M; i++) { 

            // Check the hash values of current window of text 
            // and pattern. If the hash values match then only 
            // check for characters on by one 
            if ( p == t ) { 
                /* Check for characters one by one */
                for (j = 0; j < M; j++) { 
                    if (txt[i+j] != pat[j]) 
                        break; 
                } 

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1] 
                if (j == M) 
                    return i;
            } 

            // Calculate hash value for next window of text: Remove 
            // leading digit, add trailing digit 
            if ( i < N-M ) { 
                t = (d*(t - txt[i]*h) + txt[i+M])%q; 

                // We might get negative value of t, converting it 
                // to positive 
                if (t < 0) 
                t = (t + q); 
            } 
        }
        return -1;
    }
}
Time O(N+M)
Space O(1)
Although i used two char array. They can be avoided.

Why use a prime number in hashCode?
Prime numbers are chosen to best distribute data among hash buckets. If the distribution of inputs is random and evenly spread, then the choice of the hash code/modulus does not matter. It only has an impact when there is a certain pattern to the inputs.

Do upvote if you liked the solution.