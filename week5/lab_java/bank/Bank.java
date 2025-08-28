package bank;

import java.util.Scanner;

public class Bank {
    private float balance;
    static Scanner in = new Scanner(System.in);

    private void readStartingBalance () {
        System.out.print("Starting balance: ");
        this.balance = in.nextFloat();
    }

    private void deposit() {
        System.out.print("Amount to deposit is $");
        float deposit = in.nextFloat();
        System.out.printf("Amount deposited is $%.2f\n",deposit);
        this.balance += deposit;
        System.out.printf("Balance after the deposit is $%.2f\n",this.balance);
    }

    private void withdraw() {
        System.out.print("Amount to withdraw is $");
        float withdraw = in.nextFloat();
        System.out.printf("Amount withdrawn is $%.2f\n", withdraw);
        if (withdraw <= this.balance){
            this.balance -= withdraw;
            System.out.printf("Balance after the withdrawal is $%.2f\n",this.balance);
        } else {
            System.out.println("Insufficient fund!");
        }
    }

    private void showBalance() {
        System.out.printf("Current balance $%.2f\n", this.balance);
    }

    public void menu() {
        System.out.print("Start banking (d/w/s/x): ");
        char c = in.next().charAt(0);
        while (c!='x') {
            switch (c){
                case 'd':
                    this.deposit();
                    break;
                case 'w':
                    this.withdraw();
                    break;
                case 's':
                    this.showBalance();
                    break;
                default:
                    System.out.println("Available options (d/w/s/x): ");
                    break;
            }
            System.out.print("Continue banking (d/w/s/x): ");
            c = in.next().charAt(0);
        }
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.readStartingBalance();
        myBank.menu();
    }
}
