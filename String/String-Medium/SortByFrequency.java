
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByFrequency {
    public static void main(String args[])
    {
        Pair freq[]=new Pair[26];
        //Initialize the freq array
        for(int i=0;i<freq.length;i++)
        {
            freq[i]=new Pair(0,(char)(i+'a'));
        }
        String s="geeksforgeeks";

        //Calculate frequency of each character
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a'].freq++;
        }
        //Sort the freq array based on 
        // frequency and lexicographical order (if the freq is same , sort by lexocogaphical order)

        Arrays.sort(freq,(a,b)->{
            if(a.freq!=b.freq)
            {
                return b.freq-a.freq;
            }
            else{
                return a.ch-b.ch;
            }
        });

        List<Character> result=new ArrayList<>();
        for(Pair p:freq)
        {
            while(p.freq>0)
            {
                result.add(p.ch);
                p.freq--;
            }
        }
        System.out.println(result);




    }
    static class Pair 
    {
        int freq;
        char ch;
        Pair(int freq, char ch)
        {
           this.freq=freq;
           this.ch=ch;
        }

    }
}
