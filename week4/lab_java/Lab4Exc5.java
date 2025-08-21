import java.util.Scanner;

public class Lab4Exc5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = in.nextInt();
        while (n!=-1) {
            int sum = 0;

            for (int i = 1; i <= n ; i++) {
                if (i%2==0) {
                    sum += i;
                }
            }

            System.out.println("Even-sum of "+n+" is "+sum);
            System.out.print("n = ");
            n = in.nextInt();
        }
    }
}
