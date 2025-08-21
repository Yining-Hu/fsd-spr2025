import java.util.Arrays;
import java.util.Random;

public class Lab4Exc2 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
