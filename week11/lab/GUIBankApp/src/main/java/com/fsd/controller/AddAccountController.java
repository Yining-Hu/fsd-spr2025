package com.fsd.controller;

import javafx.fxml.*;
import javafx.scene.control.*;
import com.fsd.model.*;
import com.fsd.ap.fx.*;

public class AddAccountController extends Controller<Customer> {
	public final Customer getCustomer() { return model; }

	@FXML private TextField typeTf;
	@FXML private TextField creditLimitTf;
	@FXML private Button addBtn;

	private String getType() { return typeTf.getText(); }
	private void setType(String type) { typeTf.setText(type); }

	private double getCreditLimit() { return Double.parseDouble(creditLimitTf.getText()); }
	private void setCreditLimit(double creditLimit) { creditLimitTf.setText("" + creditLimit); }

	@FXML private void initialize() {
		typeTf.textProperty().addListener((o, oldText, newText) -> updateButtons());
		creditLimitTf.textProperty().addListener((o, oldText, newText) -> updateButtons());
	}

	private void updateButtons() {
		// Both type and credit limit need to be valid.
		// If not, disable the Add button.
		addBtn.setDisable(!(isTypeValid() && isCreditLimitValid()));
		// Note: By De Morgan's Laws, we could also have written:
		// addBtn.setDisable(!isTypeValid() || !isCreditLimitValid());
		// i.e. Disable if either the type is invalid or the credit limit is invalid.
	}

	private boolean isTypeValid() {
		return getType().length() >= 4;
	}

	private boolean isCreditLimitValid() {
		// The regular expression [0-9] matches a digit
		// The regular expression [0-9] matches 1 or more digits
		return creditLimitTf.getText().matches("[0-9]+");
	}

	@FXML private void handleCancel() {
		stage.close();
	}

	@FXML private void handleAdd() {
		// The model we chose for this controller is the one that will "contain"
		// the new account. i.e. The customer.
		// This allows us to invoke the addAccount() method on the customer.
		getCustomer().addAccount(getType(), getCreditLimit());
		stage.close();
	}
}
