
import java.util.Scanner;
import java.util.HashMap;
public class IsomorphicString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1.length()!=s2.length())
        {
            System.out.println("NO");
        }
        HashMap<Character,Character> hash=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char original=s1.charAt(i);
            char replacement=s2.charAt(i);
            if(!hash.containsKey(original))
            {
                if(!hash.containsValue(replacement))
                {
                    hash.put(original,replacement);
                }
                else{
                    System.out.println("NO");
                    break;
                }
            }
            else{
                if(replacement!=hash.get(original))
                {
                    System.out.println("NO");
                    break;
                }
            }
            
        }
        System.out.println("YES");
        

    }
}
