from customer import Customer
from config import read_from_file,write_to_file,initialize

class Bank:
    def __init__(self):
        # get initial customer data from file
        # self.customers = []
        # self.add_customers()
        initialize()
        # self.customers = read_from_file()
        pass
    
    def add_customers(self):
        while len(self.customers) < 3:
            c = Customer() 

            if self.check_customer(c.name):
                print("Customer name in use. Please enter a new customer name.")
                continue

            self.customers.append(c)
            print(f"Customer '{c.name}' added successfully.")
    
    # need re-writting
    # used by CRUD operations
    def check_customer(self, name):
        customers = read_from_file()
        if customers != []:
            for c in customers:
                if c.match(name):
                    return c
            return None
        else:
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
        # read customers from file (instead of accessing the customers field)
        customers = read_from_file()
        new_customer = Customer()
        customer = self.check_customer(new_customer.name)
        if (customer == None):
            # write all customers to file (instead of updating the customers field)
            customers.append(new_customer)
            write_to_file(customers)
        else:
            print("Customer already exists")
    
    # workaround (avoiding issues with object identity matching)
    def remove(self):
        customers = read_from_file()
        name = self.read_name()
        for c in customers:
            if c.match(name):
                customers.remove(c)
                write_to_file(customers)
                print("Customer removed")
                return
        print("Customer does not exist")
    
    # can start with view
    def view(self):
        customers = read_from_file()
        # for customer in self.customers:
        for customer in customers:
            print(customer)