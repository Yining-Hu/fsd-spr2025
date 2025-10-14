package lecture.PropertiesDemo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Account {
    // private String name;

    // public String getName() { return this.name; }
    // public void setName(String name) { this.name = name; }

    // with properties
    public Account(String name) {
        this.setName(name);
    }

    private StringProperty name = new SimpleStringProperty();
    public final String getName() {return name.get();}
    public final void setName(String name) {this.name.set(name);}
    public StringProperty nameProperty() {return name;}
}
