public class CashRegister {
    private double cash;

    public CashRegister() {
        cash = 0.0;
    }
    
    public void gain(double amount) {
        this.cash += amount;
    }

    public void pay(double amount) {
        this.cash -= amount;
    }

    public boolean isEmpty() {
        return this.cash == 0;
    }

    public boolean has(double cash) {
        return this.cash >= cash;
    }

    @Override
    public String toString() {
        String formatted = String.format("%.2f", this.cash);
        return (!isEmpty()) ? "Cash level: $" + formatted : "Cash register is empty";
    }
}
