import java.util.Scanner;
import java.util.Arrays;

public class Numbers {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 10;
        numbers[numbers.length-1] = -5;
        numbers[numbers.length/2] = 3;
        System.out.println(Arrays.toString(numbers));
    }
}
