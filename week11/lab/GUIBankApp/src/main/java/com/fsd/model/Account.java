package com.fsd.model;

import javafx.beans.property.*;

public class Account {
	private StringProperty type = new SimpleStringProperty();
	private DoubleProperty creditLimit = new SimpleDoubleProperty();
	private DoubleProperty balance = new SimpleDoubleProperty();

	public Account(String type, double creditLimit) {
		this.type.set(type);
		this.creditLimit.set(creditLimit);
		this.balance.set(0.0);
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
		return getBalance() + getCreditLimit() >= amount;
	}

	public final double getCreditLimit() {
		return creditLimit.get();
	}

	public final void setCreditLimit(double creditLimit) {
		this.creditLimit.set(creditLimit);
	}

	public DoubleProperty creditLimitProperty() {
		return creditLimit;
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
		return type.get() + " account";
	}
}
