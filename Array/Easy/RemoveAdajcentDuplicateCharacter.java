package Array.Easy;

public class RemoveAdajcentDuplicateCharacter {
    public static void main(String args[])
    {
        String str="aaabbccdde";
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length()-1;i++)
        {
            if(i>0 && str.charAt(i)==str.charAt(i+1))
            {
                continue;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
