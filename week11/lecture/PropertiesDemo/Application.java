package lecture.PropertiesDemo;

import javafx.beans.property.StringProperty;

public class Application {
    public static void main(String[] args) {
        Account account = new Account("Savings");
        System.out.println(account.getName());
        StringProperty nameProperty = account.nameProperty();
        System.out.println(nameProperty);
    }
}
