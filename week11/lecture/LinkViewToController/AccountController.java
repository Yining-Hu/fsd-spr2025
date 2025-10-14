package lecture.LinkViewToController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AccountController {
    @FXML private TextField nameTf;
    @FXML private TextField balanceTf;
    @FXML private TextField amountTf;

    @FXML private void initialize() {
        nameTf.setText("Savings");
        balanceTf.setText("0.00");
        amountTf.setText("0.01");
    }

    private String getName() {
        return nameTf.getText(); 
    }
    
    private double getBalance() {
        return Double.parseDouble(balanceTf.getText()); 
    }

    private double getAmount() {
        return Double.parseDouble(amountTf.getText()); 
    }
    
    private void setAmount(double amount) {
        amountTf.setText("" + amount);
    }

    private Account account = new Account("Mr. Smith");

    @FXML
    private void handleDeposit(ActionEvent event) {
        account.deposit(getAmount());
    }

    @FXML 
    private void handleWithdraw(ActionEvent event) {
        account.withdraw(getAmount());
        setAmount(0);
    }
}
