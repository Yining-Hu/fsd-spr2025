import java.util.Scanner;

class Lab4Exc10{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int fn;

        System.out.print("n  = ");
        int n = in.nextInt();

        System.out.printf("%3d %n", first);

        while (second <= n) {
            fn = first + second;
            first = second;
            second = fn;
            System.out.printf("%3d %n", first);
        }
    }
}