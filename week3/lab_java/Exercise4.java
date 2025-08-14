import java.util.Scanner;

public class Exercise4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the x1 coordinate of point A: ");
        float x1 = in.nextFloat();
        System.out.println("Please enter the y1 coordinate of point A: ");
        float y1 = in.nextFloat();
        System.out.println("Please enter the x2 coordinate of point B: ");
        float x2 = in.nextFloat();
        System.out.println("Please enter the y2 coordinate of Point B: ");
        float y2 = in.nextFloat();

        System.out.printf("The distance between A(%.2f,%.2f) and B(%.2f,%.2f) is %.2f.\n", x1,y1,x2,y2,Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }
}
