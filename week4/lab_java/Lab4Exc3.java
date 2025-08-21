import java.util.Scanner;

public class Lab4Exc3 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = in.nextInt();
        while(n!=0) {
            for (int i=0; i<n ; i++) {
                System.out.print('*');
            }
            System.out.print("\n");
            System.out.print("n = ");
            n = in.nextInt();
        }
    }
}
