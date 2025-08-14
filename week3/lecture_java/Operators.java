public class Operators {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        y = x++; // y = x and then x = x +1
        System.out.println("x = " + x + " and y = " + y);
        
        x = 2;
        y = 3;

        y = ++x; // x = x +1 and then y = x
        System.out.println("x = "+x+" and y = "+y);
    }
}