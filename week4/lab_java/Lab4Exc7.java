import java.util.Scanner;

public class Lab4Exc7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;

        System.out.print("Enter your character: ");
        char c = Character.toLowerCase(in.next().charAt(0));

        while (c!='.') {
            if ("aeiou".contains(String.valueOf(c))) {
                count += 1;
            }
            System.out.print("Enter your character: ");
            c = Character.toLowerCase(in.next().charAt(0));
        }

        System.out.println("You have entered "+count+" vowels.");
    }
}