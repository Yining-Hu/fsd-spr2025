package bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import utils.In;

class Bank {
    static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/uuuu - HH:mm:ss");
    static LocalDateTime NOW = LocalDateTime.now();
    private List<Customer> customers;
    private Manager admin;
    
    public static void main(String[] args) {
        (new Bank()).menu();
    }

    public Bank() {
        admin = new Manager();
        BackUp.initialize();
        customers = BackUp.read();
    }

    private char readChoice(){
        System.out.print("Please select (L/A/X): ");
        return In.nextChar();
    }
    
    private Customer customer(String name) {
        customers = BackUp.read();  
        for(Customer c:customers)
            if(c.match(name))
                return c;
        return null;
    }

    private String readName() {
        System.out.print("Enter Customer Name: ");
        return In.nextLine();
    }

    public void show() {
        Customer customer = customer(readName());
        if (customer != null)
            System.out.println(customer);
        else
            System.out.println("Customer does not exist");
    }
    
    void view() {
        customers = BackUp.read();
        customers.forEach(System.out::println);
    }

    void add() {
        customers = BackUp.read();
        String name = readName();
        Customer customer = customer(name);
        if (customer == null) {            
            customers.add(new Customer(name));
            BackUp.write(customers);
        }else{
            System.out.println("Customer already exists");
        }
    }
    
    void remove(){
        Customer customer = customer(readName());
        if (customer != null){
            customers.remove(customer);
            BackUp.write(customers);
        }else
            System.out.println("Customer does not exist");
    }
    
    private void customerLogin() {
        Customer c = customer(readName());
        if (c != null) {
            int index = customers.indexOf(c);
            c.use();
            customers.set(index, c);
            BackUp.write(customers);
        } else
            System.out.println("Customer does not exist");
    }

    private void adminLogin(Bank bank) {
        admin.use(bank);
    }
        
    public void menu() {
        System.out.println("Bank menu: "+DTF.format(NOW));
        char c;
        while((c = readChoice()) != 'X'){
            switch(c){
                case 'L': customerLogin(); break;
                case 'A': adminLogin(this); break;
                default: help(); break;
            }
        }
        System.out.println("Done");
    }
    
    private void help() {
        System.out.println("Menu options");
        System.out.println("L = Login into customer menu");
        System.out.println("A = Login to admin menu");
        System.out.println("X = exit");
    }
}

