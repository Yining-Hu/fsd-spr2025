import java.util.Scanner;

public class Exercise5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        String s = in.nextLine();

        System.out.println("First character: " + s.charAt(0));
        System.out.println("Last character: " + s.charAt(s.length()-1));
        System.out.println("Lower-case string: " + s.toLowerCase());
        System.out.println("String length: "+s.length());
    }
}
