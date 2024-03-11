package CH3.Lottery;
/* Suppose you want to develop a program to play lottery. The program randomly generates a lottery of a two-digit number,
prompts the user to enter a two-digit number, and determines whether the user wins according to the following rules:
    1. If the user input matches the lottery number in the exact order, the award is $10,000.
    2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
    3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
    Note the digits of a two-digit number may be 0.
If a number is less than 10, we assume that the number is preceded by a 0 to form a two-digit number.
For example, number 8 is treated as 08, and number 0 is treated as 00 in the program.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {
    /** Generates a lottery number
     * @return: a Randomly two digits number.
     */
    public static int getLotteryNumber() {
        return (int)(Math.random() * 100);
    }

    /** Extracts digit from the number
     * @param num:The number for extracting
     * @return: the list holds digits
     */
    public static ArrayList<Integer> getDigit(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add( num / 10); // Adds the first digit to the list
        result.add(num % 10); // Adds the last digit to the list
        return result;
    }
    public static void  main(String[] args) {

        // Generates a lottery number.
        int lottery = getLotteryNumber();

        // Prompts the user to enter a guess
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your lottery pick (two digits): ");
        int guess = scanner.nextInt();

        // Variable declaration
        ArrayList<Integer> lotteryDigits = new ArrayList<>(2);
        ArrayList<Integer> guessDigits = new ArrayList<>(2);

        // Gets digits from lottery
        lotteryDigits = getDigit(lottery);

        // Gets digits from guess
        guessDigits = getDigit(guess);


        System.out.println("The lottery number is: " + lottery);
        // Checks the guess
        if(guess == lottery) {
            System.out.println("Exact match: you win $10,000.");
        }
        else if(guessDigits.get(0).equals(lotteryDigits.get(1))  && guessDigits.get(1).equals(lotteryDigits.get(0))) {
            System.out.println("Match all digits: you win $3,000.");
        }
        else if(guessDigits.get(0).equals(lotteryDigits.get(0)) ||
                guessDigits.get(0).equals(lotteryDigits.get(1)) ||
                guessDigits.get(1).equals(lotteryDigits.get(0)) ||
                guessDigits.get(1).equals(lotteryDigits.get(1))) {
            System.out.println("Match 1 digit: you win $1,000.");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}
