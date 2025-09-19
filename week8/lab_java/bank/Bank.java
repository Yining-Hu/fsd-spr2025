import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
        addCustomers();
    }

    private void addCustomers() {
        int added = 0;
        while (added < 3) {
            Customer c = new Customer();

            if (customer(c.getName()) != null) {
                System.out.println("Customer name in use. Please enter a new customer name.");
                continue;
            }

            this.customers.add(c);
            added++;
            System.out.println("Customer '" + c.getName() + "' added successfully.");
        }
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
        customers.forEach(System.out::println);
    }

    public void add(){        
        String name = readName();
        Customer customer = customer(name);
        if (customer == null) {            
            customers.add(new Customer(name));
            System.out.println("Customer '" + name + "' added successfully.");
        } else {
            System.out.println("Customer already exists");
        }
    }
    
    public void remove(){
        Customer customer = customer(readName());
        if (customer != null){
            customers.remove(customer);
            System.out.println("Customer '" + customer.getName() + "' removed.");
        } else
            System.out.println("Customer does not exist");
    }
    
    public void customerLogin() {
        Customer c = customer(readName());
        if (c != null)
            c.use();
        else
            System.out.println("Customer does not exist");
    }
}
