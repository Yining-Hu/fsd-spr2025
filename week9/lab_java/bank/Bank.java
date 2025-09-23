package bank;

import java.util.List;

class Bank {
    private List<Customer> customers;

    public Bank() {
        Config.initialize();
        customers = Config.read();
    }

    private Customer customer(String name){        
        for(Customer c:customers)
            if(c.match(name))
                return c;
        return null;
    }

    private String readName() {
        System.out.print("Enter Customer Name: ");
        return Config.IN.next();
    }

    public void show() {
        Customer customer = customer(readName());
        if (customer != null)
            System.out.println(customer);
        else
            System.out.println("Customer does not exist");
    }
    
    public void view() {
        customers = Config.read();
        customers.forEach(System.out::println);
    }

    public void add(){        
        String name = readName();
        Customer customer = customer(name);
        customers = Config.read();
        if (customer == null) {            
            customers.add(new Customer(name));
            System.out.println("Customer '" + name + "' added successfully.");
            Config.write(customers);
        } else {
            System.out.println("Customer already exists");
        }
    }
    
    public void remove(){
        Customer customer = customer(readName());
        if (customer != null){
            customers.remove(customer);
            System.out.println("Customer '" + customer.getName() + "' removed.");
            Config.write(customers);
        } else
            System.out.println("Customer does not exist");
    }
    
    public void customerLogin() {
        Customer c = customer(readName());
        if (c != null) {
            int index = customers.indexOf(c);
            c.use();
            customers.set(index, c);
            Config.write(customers);
        } else {
            System.out.println("Customer does not exist");
        }
    }
}
