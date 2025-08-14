import java.util.Arrays;

public class ArrayManagement {
    public static void main(String[] args) {
        /*
         * Syntax to create an array:
         * <type> [] <arrayname> = new <type>[size];
         * 
         * Array elements are indexed 
         * Array elements are ordered
         * Arrays allow duplicates
         * Arrays elements are changeable
         */

        String[] names = new String[3];
        names[0] = "John Smith";
        names[1] = "Alen";
        names[2] = "Lucy";
        System.out.println(Arrays.toString(names));

        names[0] = "John";
        names[1] = "Alana";
        names[2] = "Lucy";
        System.out.println(Arrays.toString(names));

        int x[] = new int[] { 4, 6, 2 };
        System.out.println(Arrays.toString(x));

        x[0]++; // x[0] = x[0] +1
        System.out.println(Arrays.toString(x));

        ++x[0]; // x[0] = x[0] +1
        System.out.println(Arrays.toString(x));
    }
}
