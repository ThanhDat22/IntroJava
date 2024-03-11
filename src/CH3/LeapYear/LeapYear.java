package CH3.LeapYear;

import java.util.Scanner;

public class LeapYear {
    /** Checks whether the year is leap year.
     * @param year: the year is checked.
     * @return: {true} if the year is leap year, {false} otherwise.
     */
    public static boolean isLeapYear(int year) {
        // LeapYear is divisible by 4 but not by 100 or
        // LeapYear is divisible by 400
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year;

        // Prompts the user to enter a year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        year = scanner.nextInt();
        System.out.print("Year " + year + " is leapYear: " + isLeapYear(year) + "\n");
    }
}
