package evaluate_expression;

import javax.swing.*;

import static evaluate_expression.EvaluateExpression.evaluate;
import static evaluate_expression.EvaluateExpression.infixToPostfix;


public class Main {
    public static void main(String[] args) throws Exception{

        // Let the user input the expression.
        String s = "( 1 + 3 * 3 - 2 ) * ( 12 / 6 * 5 )";
        int result = evaluate(infixToPostfix(s));
        System.out.println(result);
    }
}
