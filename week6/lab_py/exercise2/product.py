class Product:
    def __init__(self,type,price,quantity):
        self.type = type
        self.price = price
        self.quantity = quantity

    @classmethod
    def default_constructor(cls):
        return cls(input('Type: '),float(input('Price: ')), int(input('Quantity: ')))
    
    def is_empty(self):
        return self.quantity == 0
    
    def stocked(self,quantity):
        self.quantity += quantity
    
    def sold(self, quantity):
        self.quantity -= quantity
    
    def has(self,quantity):
        return self.quantity >= quantity
    
    def cash(self,quantity):
        return quantity * self.price 
    
    def __str__(self) -> str:
        if self.quantity >= 0:
            return f'{self.type} level: {self.quantity} at price {self.price}'
        else:
            return f'{self.type} stock level: {self.quantity}'