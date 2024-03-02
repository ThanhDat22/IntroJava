package evaluate_expression;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {

    /** Evaluates a postfix expression using a stack.
     @param postfixExp: postfix expression to evaluate
     @return: evaluation result
     @throws ArithmeticException: divide-by-zero
     */
    public static int evaluate(String postfixExp) {
        Stack<Integer> stk = new Stack<>();
        Scanner scanner = new Scanner(postfixExp);
        while (scanner.hasNext()) {
            String token = scanner.next();
            if (Character.isDigit(token.charAt(0))) { stk.push(Integer.valueOf(token)); }
            else {
                int rightOperand = stk.pop(), leftOperand = stk.pop();
                // Supported operators
                if (token.equals("+")) { stk.push(leftOperand + rightOperand); }
                if (token.equals("-")) { stk.push(leftOperand - rightOperand); }
                if (token.equals("*")) { stk.push(leftOperand * rightOperand); }
                if (token.equals("/")) {
                    if (rightOperand == 0) {
                        scanner.close();
                        throw new ArithmeticException("Dividing by zero");
                    }
                    stk.push(leftOperand / rightOperand);
                }
            }
        }
        scanner.close();
        return stk.pop();
    }  // Time complexity: O(n)

    /** Converts an infix expression to postfix expression.
     @param infixExp: infix expression to convert
     @return: result postfix expression
     */
    public static String infixToPostfix(String infixExp) {
        Stack<String> stk = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        Scanner scanner = new Scanner(infixExp);
        while (scanner.hasNext()) {
            String token = scanner.next();
            if (Character.isDigit(token.charAt(0))) { postfix.append(token).append(' '); }
            else if (token.equals("(")) { stk.push(token); }
            else if (token.equals(")")) {
                while (!stk.peek().equals("(")) { postfix.append(stk.pop()).append(' '); }
                stk.pop(); // Pop the opening parenthesis.
            } else { // "token" is an operator.
                while (!stk.isEmpty() && !stk.peek().equals("(") && precedence(token) <= precedence(stk.peek())) {
                    postfix.append(stk.pop()).append(' ');
                }
                stk.push(token);
            }
        }
        while (!stk.isEmpty()) { postfix.append(stk.pop()).append(' '); }
        scanner.close();
        return postfix.toString();
    }  // Time complexity: O(n)

    /** Returns the precedence of an operator.
     @param oper: operator to find its precedence
     @return: precedence of the operator
     @throws IllegalArgumentException: operator is not supported.
     */
    private static int precedence(String oper) {
        if (oper.equals("*") || oper.equals("/")) { return 12; }
        if (oper.equals("+") || oper.equals("-")) { return 11; }
        throw new IllegalArgumentException("Operator not supported");
    } // Time complexity: O(1)


}
