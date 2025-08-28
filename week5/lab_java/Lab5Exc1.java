import java.util.Scanner;

public class Lab5Exc1 {
    public static Scanner in = new Scanner(System.in);

    public static double readRadius() {
        System.out.print("Radius = ");
        return in.nextDouble();
    }

    public static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double volume(double radius) {
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public static void show(String prompt, double value) {
        System.out.printf(prompt + " = %.3f %n", value);
    }

    public static void main(String[] args) {
        double radius = readRadius();
        show("Perimeter", perimeter(radius));
        show("Area", area(radius));
        show("Volume", volume(radius));
    }
}
