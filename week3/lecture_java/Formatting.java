import java.util.Scanner;

public class Formatting {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //read pattern
        System.out.print("x = ");
        double x = in.nextDouble();

        System.out.println("x = " + x);
        System.out.printf("x = %.2f \n", x);
        String result = String.format("x = %.3f", x);
        System.out.println(result);
    }
}
