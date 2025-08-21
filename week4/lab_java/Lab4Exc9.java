import java.util.Random;
import java.util.Scanner;

public class Lab4Exc9 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10) + 1;
        System.out.print("Guess  = ");
        int guess = in.nextInt();

        while (guess != n) {
            System.out.println("Sorry - try again!");
            System.out.print("Guess  = ");
            guess = in.nextInt();
        }
        System.out.println("Success, secret number = "+guess);
    }
}
