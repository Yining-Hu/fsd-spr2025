package com.fsd.model;

import javafx.beans.property.*;

public class Account {
	private StringProperty type = new SimpleStringProperty();
	private DoubleProperty balance = new SimpleDoubleProperty();

	public Account(String type, double balance) {
		this.type.set(type);
		this.balance.set(balance);
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

	/**
	 * Withdraw the specified amount of money if available.
	 *
	 * @param amount the amount of money to withdraw
	 * @throws InsufficientFundsException if the requested amount is not available
	 */
	public void withdraw(double amount) throws InsufficientFundsException {
		if (!has(amount))
			throw new InsufficientFundsException();
		setBalance(getBalance() - amount);
	}

	public boolean has(double amount) {
		return getBalance() >= amount;
	}

	public final double getBalance() {
		return balance.get();
	}

	private final void setBalance(double value) {
		balance.set(value);
	}

	public ReadOnlyDoubleProperty balanceProperty() {
		return balance;
	}

	public final String getType() {
		return type.get();
	}

	public final void setType(String value) {
		type.set(value);
	}

	public StringProperty typeProperty() {
		return type;
	}

	@Override
	public String toString() {
		return type.get() + " Account";
	}
}
