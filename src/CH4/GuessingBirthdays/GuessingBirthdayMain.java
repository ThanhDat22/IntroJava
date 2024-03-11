package CH4.GuessingBirthdays;

import javax.swing.*;

import static CH4.GuessingBirthdays.GuessingBirthdays.collectReply;

public class GuessingBirthdayMain {
    public static void main(String[] args) {
        int day = 0; // Day to be determined

        for (int i = 1; i < 6; i++) {
            boolean answer = collectReply(i);
            if (answer) {
                day += Math.pow(2, i - 1);
            }
        }

        String output = "Your birthday is: " + day;
        JOptionPane.showMessageDialog(null, output);

    }
}