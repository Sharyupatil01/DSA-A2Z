class CountNoOfVowelsAndConsotent {
    public static void main(String args[])
    {
        String str="hello world";

        int v=0;
        int c=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(vowels.indexOf(ch) != -1)
            {
                v++;
            }
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);



    }
}
