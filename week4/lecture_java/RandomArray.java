/*
 * Create a random integer array of size n (read from STDIN) and seed 100
 * Calculate and show the min, max, total, and average values
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomArray {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = in.nextInt();

        int numbers[] = new int[n];
        Random r = new Random(100);

        for(int i=0; i < numbers.length; i++)
            numbers[i] = r.nextInt();
            
        System.out.println(Arrays.toString(numbers));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;        

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
            if (max < numbers[i])
                max = numbers[i];
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;
        System.out.println("Min = "+min+"\n"+
                            "Max = "+max+"\n"+
                            "Sum = " + sum +"\n" +
                            "Average = "+avg);
    }
}
