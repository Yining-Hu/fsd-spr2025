class Account:
    def __init__(self, account_type):
        self.type = account_type
        self.balance = self.read_balance()

    def read_balance(self):
        print(f'Initial {self.type} balance $', end='')
        return float(input())

    def has_balance(self, amount):
        return self.balance >= amount
    
    def has_type(self,account_type):
        return self.type == account_type

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    def pay_to(self, amount, target):
        self.balance -= amount
        target.balance += amount

    def __str__(self):
        return f'{self.type} balance: ${self.balance:.2f}'