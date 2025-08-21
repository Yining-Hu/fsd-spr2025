/*
 * Enter password from STDIN until * is entered
 * 
 * verify the password against the following regular expression pattern:
 * password pattern: [A-Z][a-z]{6,}\\d{2,}
 * 
 * password pattern meaning: 
 * Starts with a single uppercase letter.
 * Is followed by at least 6 lowercase letters.
 * Ends with at least 2 digits.
 * 
 */
import java.util.Scanner;

public class Session {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String pattern = "[A-Z][a-z]{6,}\\d{2,}";

        System.out.print("Password: ");
        String password = in.nextLine();

        while (!password.equals("*")) {
            if (password.matches(pattern)) {
                System.out.println("Correct format!");
            } else {
                System.out.println("Incorrect format!");
            }

            System.out.print("Password: ");
            password = in.nextLine();
        }
    }
}
