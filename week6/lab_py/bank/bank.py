from customer import Customer

class Bank:
    def __init__(self):
        self.customer = Customer("John Smith")

    def read_amount(self, action):
        print(f"Amount to {action} $",end='')
        return float(input())

    def deposit(self):
        amount = self.read_amount("deposit")
        self.customer.deposit(amount)
        print(f'Amount {amount:.2f} deposited')

    def withdraw(self):
        amount = self.read_amount("withdraw")
        if self.customer.is_sufficient(amount):
            self.customer.withdraw(amount)
            print(f'Amount {amount:.2f} withdrawn')
        else:
            print("Insufficient funds!")

    def transfer(self):
        amount = self.read_amount("transfer")
        if self.customer.is_sufficient(amount):
            self.customer.transfer(amount)
            print(f'Amount {amount:.2f} transferred')
        else:
            print("Insufficient funds!")

    def show(self):
        self.customer.show()

    def read_choice(self):
        return input("Start Banking (d/w/t/s/x): ")[0]

    def help(self):
        print("d - deposit")
        print("w - withdraw")
        print("t - transfer")
        print("s - show")
        print("x - exit")

    def main(self):
        choice = self.read_choice()

        while choice!='x':
            match choice:
                case 'd':
                    self.deposit()
                case 'w':
                    self.withdraw()
                case 't':
                    self.transfer()
                case 's':
                    self.show()
                case _:
                    self.help()

            choice = self.read_choice()

if __name__ == "__main__":
    Bank().main()