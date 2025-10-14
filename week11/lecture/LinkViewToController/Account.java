package lecture.LinkViewToController;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Account {
    public Account(String name) {
        this.name.set(name);
        this.balance.set(0.0);
    }

    private StringProperty name = new SimpleStringProperty();
	public final String getName() { return name.get(); }
    public final void setName(String name) { this.name.set(name); }	
    public StringProperty nameProperty() { return name; }

    private DoubleProperty balance = new SimpleDoubleProperty();
    public final double getBalance() { return balance.get(); }
    public ReadOnlyDoubleProperty balanceProperty() { return balance; }
    public void deposit(double amount) { balance.set(getBalance() + amount); }
    public void withdraw(double amount) { balance.set(getBalance() - amount); }
}