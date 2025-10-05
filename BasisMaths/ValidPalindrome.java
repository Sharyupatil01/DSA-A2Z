package BasisMaths;

public class ValidPalindrome {
    public static void main(String args[])
    {
        String a= "A man, a plan, a canal: Panama";
        int left=0;
        int right=a.length()-1;
        while(a.length()>0)
        {
            char char1=a.charAt(left);
            char char2=a.charAt(right);

            if(!Character.isLetterOrDigit(char1))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(char2))
            {
                right--;
            }
            else{
                if(Character.toLowerCase(char2)!=Character.toLowerCase(char1))
                {
                    System.out.println("false");
                    break;
                }
                left++;
                right--;
            }


        }
        System.out.println("true : it is palindrome");
        
       
    }
    
}
