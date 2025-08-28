import java.util.Scanner;

/*
 * Read a string from STDIN until * is entered
 * determine if any string a user enters is a palindrome
 * 
 */
/*
 * Top level: determine and show palindrome strings
 * second: check if a string is a palindrome
 * third: reverse a string
 */
public class Palindrome {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "";

        while (!(s = readString()).equals("*")) {
            System.out.println(isPalindrome(s) ? s+" is a palindrome": s+" is not a palindrome");
        }
    }
    
    public static String readString() {
        System.out.print("String: ");
        return in.nextLine();
    }

    public static boolean isPalindrome(String s) {
        int mid = (s.length()%2 == 0) ? s.length()/2 : s.length()/2 +1;
        String left = s.substring(0, mid);
        String right = s.substring(s.length() / 2, s.length());
        return left.equals(reverseString(right));
    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
