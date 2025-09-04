package bank;

import java.util.Scanner;

class Bank {
    private Customer customer;
    private Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        (new Bank()).menu();
    }

    public Bank() {
        this.customer = new Customer("John Smith");
    }

    private double readAmount(String action) {
        System.out.print("Amount to " + action + " $");
        return in.nextDouble();
    }

    private void deposit() {
        double amount = readAmount("deposit");
        this.customer.deposit(amount);
        System.out.printf("Amount %.2f deposited%n", amount);
    }

    private void withdraw() {
        double amount = readAmount("withdraw");
        if (customer.isSufficient(amount)) {
            customer.withdraw(amount);
            System.out.printf("Amount %.2f withdrawn%n", amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private void transfer() {
        double amount = readAmount("transfer");
        if (customer.isSufficient(amount)) {
            customer.transfer(amount);
            System.out.printf("Amount %.2f transferred %n", amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private void show() {
        customer.show();
    }

    private char readChoice() {
        System.out.print("Start Banking (d/w/t/s/x): ");
        return in.next().charAt(0);
    }
    
    private void help() {
        System.out.println("d - deposit");
        System.out.println("w - withdraw");
        System.out.println("t - transfer");
        System.out.println("s - show");
        System.out.println("x - exit");
    }
    
    private void menu() {
        char c;
        while ((c=readChoice()) != 'x') {
            switch (c) {
                case 'd':
                    deposit();
                    break;
                case 'w':
                    withdraw();
                    break;
                case 't':
                    transfer();
                    break;
                case 's':
                    show();
                    break;
                default:
                    help();
                    break;
            }
        }
    }
}

