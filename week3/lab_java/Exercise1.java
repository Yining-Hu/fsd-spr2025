public class Exercise1 {
    static int x = 4;
    static int y = 2;

    public static void main(String[] args) {
        System.out.printf("x + y = %.3f\n", (float)x+y);
        System.out.printf("x - y = %.3f\n", (float)x-y);
        System.out.printf("x / y = %.3f\n", (float)x/y);
        System.out.printf("x * y = %.3f\n", (float)x*y);
        System.out.printf("x %% y + x / y = %.3f\n", (x%y)+(float)x/y);
        System.out.printf("(y^7 + 7/(\u221A5 + x))*(x^4 %% 5 + 2) = %.3f\n",(Math.pow(y, 7)+7/(Math.sqrt(5)+(float)x))*(Math.pow(x, 4)%5 + 2));
    }
}
