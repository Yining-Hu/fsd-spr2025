class CashRegister:
    def __init__(self):
        self.cash = 0.0

    def gain(self, amount):
        self.cash += amount

    def pay(self,amount):
        self.cash -= amount 

    def is_empty(self):
        return self.cash == 0
    
    def has(self,amount):
        return self.cash >= amount
    
    def __str__(self) -> str:
        if self.cash >= 0:
            return f'Cash level: {self.cash:.2f}'
        else:
            return f'Cash register is empty!'