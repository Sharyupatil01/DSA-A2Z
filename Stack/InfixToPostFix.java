import java.util.Stack;

public class InfixToPostFix {
    public static void main(String args[])
    {
        String exp="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostFix(exp));
    }
    public static String infixToPostFix(String exp)
    {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if (ch==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    sb.append(stack.pop());
                }
               stack.pop();
            }
            else{
                if(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek()))
                {
                     sb.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
        
    }
    static int precedence(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-' : return 1;
            case '*':
            case '/': return 2;
            case '^' : return 3;
        }
        return -1;
    }
}
