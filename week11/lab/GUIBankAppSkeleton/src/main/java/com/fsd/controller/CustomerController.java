package com.fsd.controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.*;
import com.fsd.model.*;
import com.fsd.ap.fx.*;

public class CustomerController extends Controller<Customer> {
	@FXML private ListView<Account> accountsLv;
	@FXML private Button viewAccountBtn;

	@FXML private void initialize() {
		// accountsLv.getSelectionModel().selectedItemProperty().addListener(
		// 		(observable, oldSubject, newSubject) -> viewAccountBtn.setDisable(newSubject == null)
		// 		);
	}

	public final Customer getCustomer() {
		return model;
	}

	private Account getSelectedAccount() {
		return accountsLv.getSelectionModel().getSelectedItem();
	}

	@FXML private void handleViewAccount(ActionEvent event) throws Exception {
		ViewLoader.showStage(getSelectedAccount(), "/com/fsd/view/account.fxml", "Account", new Stage());
	}

	@FXML private void handleAddAccount(ActionEvent event) throws Exception {
		// Note which model is passed in.
		// You can't pass in the account because the account is yet to be created!
		// You pass in the customer which has the list of accounts to which the
		// new account needs to be added.
		ViewLoader.showStage(getCustomer(), "/com/fsd/view/add_account.fxml", "Add Account", new Stage());
	}
}
