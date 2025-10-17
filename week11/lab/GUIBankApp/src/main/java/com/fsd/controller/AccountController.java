package com.fsd.controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import java.io.*;
import java.text.*;
import com.fsd.model.*;
import com.fsd.ap.fx.*;

public class AccountController extends Controller<Account> {
	@FXML private Text typeTxt;
	@FXML private Text balanceTxt;
	@FXML private TextField amountTf;

	public final Account getAccount() { return model; }

	@FXML private void initialize() {
		typeTxt.textProperty().bindBidirectional(getAccount().typeProperty());
		balanceTxt.textProperty().bind(getAccount().balanceProperty().asString("$%.2f"));
	}

	@FXML private void handleDeposit(ActionEvent event) throws IOException {
		try {
			getAccount().deposit(getAmount());
		}
		catch (Exception e) {
			// If an exception occurred, show an error window.
			// NOTE: the following line might *also* throw an IOException if
			// /view/error.fxml is not found (location not set) or if the
			// FXML file itself contains errors. But in that case, we can't
			// show the error anyway, so we just throw IOException.
			ViewLoader.showStage(e, "/com/fsd/view/error.fxml", "Error", new Stage());
		}
		finally {
			// Always reset amount, even in the case of an error.
			setAmount(0);
		}
	}

	@FXML private void handleWithdraw(ActionEvent event) throws IOException {
		try {
			getAccount().withdraw(getAmount());
			setAmount(0);
		}
		catch (Exception e) {
			// If an exception occurred, show an error window.
			// NOTE: the following line might *also* throw an IOException if
			// /view/error.fxml is not found (location not set) or if the
			// FXML file itself contains errors. But in that case, we can't
			// show the error anyway, so we just throw IOException.
			ViewLoader.showStage(e, "/com/fsd/view/error.fxml", "Error", new Stage());
		}
		finally {
			// Always reset amount, even in the case of an error.
			setAmount(0);
		}
	}

	private double getAmount() {
		return Double.parseDouble(amountTf.getText());
	}

	private void setAmount(double value) {
		amountTf.setText(new DecimalFormat("###,##0.00").format(value));
	}
}
