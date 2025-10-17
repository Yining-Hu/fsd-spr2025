package com.fsd;

import javafx.application.*;
import javafx.stage.*;
import com.fsd.model.*;
import com.fsd.ap.fx.*;

public class BankApplication extends Application {
	public static void main(String[] args) { launch(args); }

	@Override
	public void start(Stage stage) throws Exception {
		ViewLoader.showStage(new Customer("Mr Smith"), "/com/fsd/view/customer.fxml", "Customer", stage);
	}
}
