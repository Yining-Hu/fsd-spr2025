/*
 * Read integers between 1 and 100 from keyboard until -1 is entered
 * Count and show the occurences of integer-groups: 0-9, 10-19, 20-29, 30-39, ..., 90-99.
 */

import java.util.Scanner;

public class Frequency {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //group container
        int[] count = new int[10];

        System.out.print("value = ");
        int value = in.nextInt();

        while (value != -1) {
            count[value / 10]++;

            System.out.print("value = ");
            value = in.nextInt();
        }

        for (int i = 0; i < count.length; i++) {
            int start = 10 * i;
            int end = start + 9;
            System.out.println(start+"-"+end+": "+count[i]);
        }
    }
}
