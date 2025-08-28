class Bank:
    def __init__(self) -> None:
        self.balance = 0

    def readStartingBalance(self):
        self.balance = float(input("Starting balance: $"))

    def deposit(self):
        inpt = input("Amount to deposit $")
        deposit = float(inpt)
        self.balance += deposit
        print(f'Amount ${deposit:.2f} deposited')
    
    def withdraw(self):
        inpt = input("Amount to withdraw $")
        withdraw = float(inpt)
        if (withdraw <= self.balance):
            self.balance -= withdraw
            print(f'Amount ${withdraw:.2f} withdrawn')
        else:
            print("Insufficient funds!")

    def show(self):
        print("Current balance is ", self.balance)

    def menu(self):
        c = input("Start banking (d/w/s/x): ").strip()

        while (c!="x"):
            match c:
                case "d":
                    self.deposit()
                case "w":
                    self.withdraw()
                case "s":
                    self.show()
                case _:
                    print("Available options (d/w/s/w).")

            c = input("Continue banking (d/w/s/x): ").strip()

    def main(self):
        self.readStartingBalance()
        print("Starting balance is $", self.balance)
        self.menu()

if __name__ == "__main__":
    my_bank = Bank()
    my_bank.main()