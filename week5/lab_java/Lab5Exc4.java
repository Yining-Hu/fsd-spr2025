import java.util.Arrays;
import java.util.Random;

public class Lab5Exc4 {
    
    public static int[] numbers() {
        int[] temp = new int[5];
        Random r = new Random();

        for (int i = 0; i < temp.length; i++) {
            temp[i] = r.nextInt(11);
        }

        return temp;
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // method overloading
    public static int[] factorial(int[] numbers) {
        int temp[] = new int[5];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = factorial(numbers[i]);
        }
        return temp;
    }

    public static void show(int[] values) {
        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) {
        int[] numbers = numbers();
        show(numbers);
        show(factorial(numbers));
    }
}
