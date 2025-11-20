package Array.Medium.LeetcodeWeekly;

import java.util.HashMap;

public class WordPattern {
    public static void main(String args[])
    {
        String pattern="abba",s="dog cat cat dog";
        String arr[]=s.trim().split("\\s+");
        if(pattern.length()!=arr.length)
        {
            System.out.println(false);
            return;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(arr[i]))
                {
                    System.out.println(false);
                    return;
                }
            }
            else{
                if(map.containsValue(arr[i]))
                {
                    System.out.println(false);
                    return;
                }
                map.put(ch,arr[i]);
            }
        }
        System.out.println(true);
        
      

    }
}
