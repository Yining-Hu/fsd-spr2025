import java.util.Scanner;

public class Exercise3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter circle radius: ");
        double r = in.nextDouble();

        System.out.printf("Circle area of radius \"%.2f\" is: %.2f\n", r,Math.PI*r*r);
        System.out.printf("Sphere volume of radius \"%.2f\" is %.2f\n", r,(4.0/3.0)*Math.PI*Math.pow(r, 3));
    }
}

