import java.util.Scanner;

public class Account {
    private String type;
    private double balance;
    private Scanner in = new Scanner(System.in);

    public Account(String type) {
        this.type = type;
        this.balance = readBalance();        
    }

    private double readBalance() {
        System.out.print("Initial " + this.type + " balance $");
        return in.nextDouble();
    }

    public boolean hasType(String type){
        return this.type.equals(type);
    }

    public boolean has(double amount) {
        return balance >= amount;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transfer(double amount, Account target) {
        this.balance -= amount;
        target.balance += amount;
    }

    @Override
    public String toString() {
        return String.format("%s account has $%.2f", type, balance);
    }         
}

