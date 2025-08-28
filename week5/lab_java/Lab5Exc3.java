import java.util.Scanner;

public class Lab5Exc3 {
    public static Scanner in = new Scanner(System.in);
    
    public static String readString() {
        System.out.print("String: ");
        return in.nextLine();
    }

    public static int vowelCount(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".contains("" + s.toLowerCase().charAt(i))){
                count++;
            }
        }
        
        return count;
    }

    public static void show(String prompt, int value) {
        System.out.printf(prompt + " = %d %n", value);
    }

    public static void main(String[] args) {
        String s;

        while (!(s = readString()).equals("*")){
            show("Vowel count", vowelCount(s));
        }

        System.out.println("Done.");
    }
}
