import java.util.Scanner;

public class Exercise2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer x: ");
        int x = in.nextInt();
        System.out.println("Enter an integer y: ");
        int y = in.nextInt();

        double z = Math.pow(x, y);
        double result = Math.sqrt(z);

        System.out.printf("x ^ y = %.2f\n", z);
        System.out.printf("\u221Az = %.2f\n", result);
    }
}