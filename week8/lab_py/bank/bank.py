from customer import Customer

class Bank:
    def __init__(self):
        self.customers = []
        self.add_customers()
    
    def add_customers(self):
        while len(self.customers) < 3:
            c = Customer() 

            if self.check_customer(c.name):
                print("Customer name in use. Please enter a new customer name.")
                continue

            self.customers.append(c)
            print(f"Customer '{c.name}' added successfully.")
    
    def check_customer(self, name):
        for c in self.customers:
            if c.match(name):
                return c
        return None
    
    def read_name(self):
        print("Enter Customer Login Name: ", end="")
        return input().strip()
    
    def customer_login(self):
        c = self.check_customer(self.read_name())
        if c:
            c.use()
        else:
            print("Customer does not exist")

    def show(self):
        customer = self.check_customer(self.read_name())
        if (customer != None):
            print(customer)
        else:
            print("Customer does not exist")

    def add(self):   
        newCustomer = Customer()
        customer = self.check_customer(newCustomer.name)
        if (customer == None): 
            self.customers.append(newCustomer)
        else:
            print("Customer already exists")
    
    def remove(self):
        customer = self.check_customer(self.read_name())
        if (customer != None):
            self.customers.remove(customer)
        else:
            print("Customer does not exist")
    
    def view(self):
        for customer in self.customers:
            print(customer)