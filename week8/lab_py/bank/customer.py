from config import DTF,NOW
from account import Account

class Customer:

    def __init__(self):
        self.name = self.read_name()
        self.accounts = [Account("Savings"), Account("Loan")]

    def read_name(self):
        print("Enter Customer Name: ", end="")
        return input()

    def match(self, name):
        return self.name == name

    def account(self, account_type):
        for account in self.accounts:
            if account.has_type(account_type):
                return account
        return None

    def deposit(self):
        savings = self.account("Savings")
        if savings:
            savings.deposit(self.read_amount("deposit"))
        else:
            print("No such account")

    def withdraw(self):
        amount = self.read_amount("withdraw")
        savings = self.account("Savings")
        if savings:
            if savings.has_balance(amount):
                savings.withdraw(amount)
            else:
                print("Insufficient funds")
        else:
            print("No such account")

    def transfer(self):
        amount = self.read_amount("transfer")
        savings = self.account("Savings")
        loan = self.account("Loan")
        if savings:
            if savings.has_balance(amount):
                if loan:
                    savings.pay_to(amount, loan)
                else:
                    print("No such account")
            else:
                print("Insufficient funds")
        else:
            print("No such account")

    def read_amount(self, action):
        print(f'Amount to {action}: $', end="")
        return float(input())

    def show(self):
        print(f'{self.name} bank statement: {NOW.strftime(DTF)}')
        for account in self.accounts:
            print(account)

    def __str__(self):
        return f'{self.name}\t--> {' | '.join(map(str, self.accounts))}'

    def read_choice(self):
        print("Customer menu (d/w/t/s/x): ", end="")
        return input().strip().lower()

    def use(self):
        print(f'{self.name} banking menu: {NOW.strftime(DTF)}')
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

        print("Back to Bank menu")

    def help(self):
        print("Menu options")
        print("d = deposit")
        print("w = withdraw")
        print("t = transfer")
        print("s = show")
        print("x = exit")
