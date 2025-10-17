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
	/* Step 1: Define the FXML properties
		- Define the text property typeTxt
		- Define the text property balanceTxt
		- Define the text property amountTf
	*/

	/* Step 2: Define the getAccount() function
		- The function should return Account model
		- The function is public and final
	*/


	/* Step 3: Update the initialize() method
		- bind typeTxt bidirectional to account property type
		- bind balance to account property balance 
	*/
	@FXML
	private void initialize() {

	}
	
	/* Step 4: Define amount getter/setter
		- Define a private function to capture amountTf string and convert it to double then return it
		- Define a private procedure to set amountTf string value as a decimal formatter at 2-decimal points
	*/



	/* Step 5: Define the FXML handleDeposit(ActionEvent) method
		- Try to make a deposit using the current account
		- Catch any exception and show it on the error.fxml
		- finally reset the amountTf to 0
	*/

	/* Step 6: Define the FXML handleWithdraw(ActionEvent) method
		- Try to make a withdraw using the current account
		- Catch any exception and show it on the error.fxml
		- finally reset the amountTf to 0
	*/	
	
}
