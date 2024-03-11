package CH3.ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

    /** Determines the zodiac of the year
     * @param year: the year.
     * @return : the Chinese Zodiac
     */
    public static String determinesZodiac(int year) {
        String result="";
        switch (year % 12) {
            case 0:
                result = "monkey";
                break;
            case 1:
                result = "rooster";
                break;
            case 2:
                result = "dog";
                break;
            case 3:
                result = "pig";
                break;
            case 4:
                result = "rat";
                break;
            case 5:
                result = "ox";
                break;
            case 6:
                result = "tiger";
                break;
            case 7:
                result = "rabbit";
                break;
            case 8:
                result = "dragon";
                break;
            case 9:
                result = "snake";
                break;
            case 10:
                result = "horse";
                break;
            case 11:
                result = "sheep";
        }
        return result;
    }
    public static void main(String[] args){
        // Prompts the user to enter a year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();

        System.out.println(determinesZodiac(year));

    }
}
