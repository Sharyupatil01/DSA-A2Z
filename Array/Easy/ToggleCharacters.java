package Array.Easy;

public class ToggleCharacters {
    public static void main(String args[])
    {
        String str="HeLLo WoRLd";
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                sb.append((char)(ch-32));
            }
            else if(ch>='A' && ch<='Z')
            {
                sb.append((char)(ch+32));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
