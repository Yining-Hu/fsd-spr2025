package com.fsd.controller;

import com.fsd.ap.fx.*;
import javafx.event.*;
import javafx.fxml.*;

public class ErrorController extends Controller<Exception> {
	public final Exception getException() { return model; }
	@FXML private void handleOK(ActionEvent event) {
		stage.close();
	}
}
