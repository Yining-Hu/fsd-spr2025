package bank;

import java.util.Scanner;

public class Bank {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Amount to deposit $");
        float deposit = in.nextFloat();
        System.out.printf("Amount to deposit $%.2f\n",deposit);

        System.out.print("Amount to withdraw $");
        float withdraw = in.nextFloat();
        System.out.printf("Amount to withdraw is $%.2f\n", withdraw);
    }
}