package bank;

public class Customer {
    private String name;
    private Account savings;
    private Account loan;

    public Customer(String name) {
        this.name = name;
        this.savings = new Account("Savings");
        this.loan = new Account("Loan");
    }    

    public boolean isSufficient(double amount) {
        return savings.has(amount);
    }
    
    public void deposit(double amount) {
        this.savings.deposit(amount);
    }

    public void withdraw(double amount) {
        this.savings.withdraw(amount);
    }

    public void transfer(double amount) {
        savings.payTo(amount, loan);
    }
    
    public void show() {
        System.out.println(this);
        System.out.println(savings);
        System.out.println(loan);
    }
    
    @Override
    public String toString() {
        return this.name+" accounts:";
    }    
}

