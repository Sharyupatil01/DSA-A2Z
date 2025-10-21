import java.util.Stack;

public class InfixToPrefix {

    // Step 1: Function to get precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    // Step 2: Convert infix to postfix (standard logic)
    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Operand → directly add to output
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
            // '(' → push to stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // ')' → pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // pop '('
            }
            // Operator
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    // Step 3: Infix → Prefix main logic
    public static String infixToPrefix(String exp) {
        // 1️⃣ Reverse the string
        StringBuilder reversed = new StringBuilder(exp).reverse();

        // 2️⃣ Swap parentheses
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(')
                reversed.setCharAt(i, ')');
            else if (reversed.charAt(i) == ')')
                reversed.setCharAt(i, '(');
        }

        // 3️⃣ Convert reversed infix to postfix
        String postfix = infixToPostfix(reversed.toString());

        // 4️⃣ Reverse postfix → prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String prefix = infixToPrefix(exp);
        System.out.println("Infix : " + exp);
        System.out.println("Prefix: " + prefix);
    }
}
