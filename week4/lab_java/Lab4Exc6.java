import java.util.Random;
import java.util.Scanner;

public class Lab4Exc6 {
    public static Random rand = new Random(10);
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = in.nextInt();
        int randNum = 0;
    
        for (int i =0; i < n; i++) {
            int sum = 0;
            randNum = rand.nextInt();
            for (int j = 1; j <= randNum; j++) {
                if (j%2 == 0) {
                    sum += j;
                }
            }
            System.out.println("Even-sum of "+randNum+" is "+sum);
        }
    }
}