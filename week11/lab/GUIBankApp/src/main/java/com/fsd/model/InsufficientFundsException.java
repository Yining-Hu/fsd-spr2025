package com.fsd.model;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {
		super("Insufficient funds");
	}
}
