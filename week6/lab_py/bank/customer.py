from account import Account

class Customer:
    def __init__(self, name):
        self.name = name
        self.savings = Account("Savings")
        self.loan = Account("Loan")

    def is_sufficient(self, amount):
        return self.savings.has_balance(amount)

    def deposit(self, amount):
        self.savings.deposit(amount)

    def withdraw(self, amount):
        self.savings.withdraw(amount)

    def transfer(self, amount):
        self.savings.pay_to(amount, self.loan)

    def show(self):
        print(self)
        print(self.savings)
        print(self.loan)

    def __str__(self):
        return f'{self.name} accounts:'
