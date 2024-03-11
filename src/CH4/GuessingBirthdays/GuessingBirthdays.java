package CH4.GuessingBirthdays;

import javax.swing.*;

public class GuessingBirthdays {
    private static final String set1 =  "1      3       5       7\n" +
                                        "9      11      13      15\n" +
                                        "17     19      21      23\n" +
                                        "25     27      29      31";
    private static final String set2 =  "2      3       6       7\n" +
                                        "10     11      14      15\n" +
                                        "18     19      22      23\n" +
                                        "26     27      30      31";

    private static final String set3 =  "4      5       6      7\n" +
                                        "12     13      14      15\n" +
                                        "20     21      22      23\n" +
                                        "28     29      30      31";

    private static final String set4 =  "8      9       10      11\n" +
                                        "12     13      14      15\n" +
                                        "24     25      26      27\n" +
                                        "28     29      30      31";

    private static final String set5 =  "16     17      18      19\n" +
                                        "20     21      22      23\n" +
                                        "24     25      26      27\n" +
                                        "28     29      30      31";

    // Methods
    public static Boolean collectReply(int numberOfSet){
        String content = "";
        switch (numberOfSet){
            case 1:
                content = set1;
                break;
            case 2:
                content = set2;
                break;
            case 3:
                content = set3;
                break;
            case 4:
                content = set4;
                break;
            case 5:
                content = set5;
                break;
            default:
                System.exit(1);
        }

        int reply = JOptionPane.showConfirmDialog(null, content, "Is your birthday in this set",JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_NO_OPTION) {
            return true;
        }
        return false;
    }

}
