package com.fsd.model;

import javafx.collections.*;
import javafx.beans.property.*;

public class Customer {
	private ObservableList<Account> accounts = FXCollections.observableArrayList();
	private StringProperty name = new SimpleStringProperty();

	public Customer(String name) {
		this.name.set(name);
	}

	public void addAccount(String type, double creditLimit) {
		accounts.add(new Account(type, creditLimit));
	}

	public final String getName() { return name.get(); }
	public final void setName(String name) { this.name.set(name); }
	public StringProperty nameProperty() { return name; }

	public final ObservableList<Account> getAccounts() {
		return accounts;
	}
}
