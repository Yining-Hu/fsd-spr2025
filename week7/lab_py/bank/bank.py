from customer import Customer
from config import DTF,NOW

class Bank:
    def __init__(self):
        self.customers = []
        self.add_customers()
    
    def add_customers(self):
        for _ in range(3):
            self.customers.append(Customer())
    
    def read_choice(self):
        print(f'Bank menu (L/A/X): {NOW.strftime(DTF)}: ',end='')
        return input().strip().upper()
    
    def customer(self, name):
        for c in self.customers:
            if c.match(name):
                return c
        return None
    
    def read_name(self):
        print("Enter Login Name: ", end="")
        return input().strip()
    
    def login(self):
        c = self.customer(self.read_name())
        if c:
            c.use()
        else:
            print("Customer does not exist")
    
    def view(self):
        for customer in self.customers:
            print(customer)
    
    def help(self):
        print("Menu options")
        print("L = Login into customer menu")
        print("V = View all customers")
        print("X = exit")

    def main(self):
        choice = self.read_choice()
        while choice!='X':
            match choice:
                case 'L':
                    self.login()
                case 'V':
                    self.view()
                case _:
                    self.help()

            choice = self.read_choice()

if __name__ == "__main__":
    Bank().main()