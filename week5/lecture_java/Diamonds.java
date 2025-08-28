/*
  Display a diamond of stars of size n (from STDIN)
  
  Example:
  n = 5

                 *
                * *
               * * *
              * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *     
  
 */
/*
 * Top level: show a diamond of any size
 * second level: show the diamond
 * third level: show top triangle
 * fourth level: show middle line
 * fifth level: show bottom triangle
 * sixth level: show a string many times
 */
import java.util.Scanner;

public class Diamonds {
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("n = ");
    int n = in.nextInt();
    
    showDiamond(n);
  }

  public static void showDiamond(int size) {
    showTopTriangle(size);
    showMiddle(size);
    showBottomTriangle(size);
  }
  
  public static void showTopTriangle(int size) {
    for(int i=1; i< size; i++)
      showLine(i, size);
  }
  
  public static void showMiddle(int size) {
    showLine(size, size);
  }
    
  public static void showBottomTriangle(int size){
    for(int i=size-1; i >= 1; i--)
      showLine(i, size);
  }

  public static void showLine(int many, int size) {
    int spaces = size - many;
    repeat(spaces, " ");
    repeat(many, "* ");
    System.out.println();
  }
  
  //repeat show a string for many times
  public static void repeat(int many, String item) {
    for(int i=0; i< many; i++)
      System.out.print(item);
  }
}
