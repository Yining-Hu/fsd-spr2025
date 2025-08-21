import java.util.Scanner;

public class Lab4Exc4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n  = ");
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (n != -1) {
            if (n >= max)
                max = n;
            if (n <= min)
                min = n;
            System.out.print("n  = ");
            n = in.nextInt();
        }
        System.out.println("Min = "+min+"\nMax = "+max);          
    }
}
