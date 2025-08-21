package bank;

import java.util.Scanner;

public class Bank {
    private static float balance = 1000;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Starting balance $%.2f\n",balance);

        System.out.print("Start banking (d/w/s/x): ");
        char c = in.next().charAt(0);
        while (c!='x') {
            switch (c){
                case 'd':
                    System.out.print("Amount to deposit is $");
                    float deposit = in.nextFloat();
                    System.out.printf("Amount deposited is $%.2f\n",deposit);
                    balance += deposit;
                    System.out.printf("Balance after the deposit is $%.2f\n",balance);
                    break;
                case 'w':
                    System.out.print("Amount to withdraw is $");
                    float withdraw = in.nextFloat();
                    System.out.printf("Amount withdrawn is $%.2f\n", withdraw);
                    if (withdraw <= balance){
                        balance -= withdraw;
                        System.out.printf("Balance after the withdrawal is $%.2f\n",balance);
                    } else {
                        System.out.println("Insufficient fund!");
                    }
                    break;
                case 's':
                    System.out.printf("Current balance $%.2f\n", balance);
                    break;
                default:
                    System.out.println("Available options (d/w/s/x): ");
                    break;
            }
            System.out.print("Continue banking (d/w/s/x): ");
            c = in.next().charAt(0);
        }
    }
}