package com.fsd.controller;

import javafx.fxml.*;
import javafx.scene.control.*;
import com.fsd.model.*;
import com.fsd.ap.fx.*;

public class AddAccountController extends Controller<Customer> {
	
	public final Customer getCustomer() { return model; }

	@FXML private TextField typeTf;
	@FXML private TextField balanceTf;
	@FXML private Button addBtn;

	private String getType() { return typeTf.getText(); }
	private void setType(String type) { typeTf.setText(type); }

	private double getBalance() { return Double.parseDouble(balanceTf.getText()); }
	private void setBalance(double balance) { balanceTf.setText("" + balance); }
	
	@FXML private void initialize() {
//		typeTf.textProperty().addListener((o, oldText, newText) -> updateButtons());
//		balanceTf.textProperty().addListener((o, oldText, newText) -> updateButtons());
	}

	private void updateButtons() {
		// Both type and balance need to be valid.
		// If not, disable the Add button.
		addBtn.setDisable(!(isTypeValid() && isBalanceValid()));
	}

	private boolean isTypeValid() {
		return getType().length() >= 4;
	}

	private boolean isBalanceValid() {
		// The regular expression [0-9] matches a digit
		// The regular expression [0-9] matches 1 or more digits
		return balanceTf.getText().matches("[0-9]+");
	}

	@FXML private void handleCancel() {
		stage.close();
	}

	@FXML private void handleAdd() {
		// The model we chose for this controller is the one that will "contain"
		// the new account. i.e. The customer.
		// This allows us to invoke the addAccount() method on the customer.
		getCustomer().addAccount(getType(), getBalance());
		stage.close();
	}
}
