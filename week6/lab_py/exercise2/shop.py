from product import Product
from cashregister import CashRegister

class Shop:
    def __init__(self):
        self.product = Product('Pencil',3.55,10)
        self.register = CashRegister()
    
    def sell(self):
        quantity = int(input('Quantity: '))
        
        if self.product.has(quantity):
            cash = self.product.cash(quantity)
            self.product.sold(quantity)
            self.register.gain(cash)
        else:
            print(f'Not enough stock!')

    def restock(self):
        quantity = int(input('Quantity: '))
        cash = self.product.cash(quantity)

        if self.register.has(cash):
            self.product.stocked(quantity)
            self.register.pay(cash)
        else:
            print(f'Not enough cash!')

    def view(self):
        print(self.product)
        print(self.register)

    def help(self):
        print('s - sell')
        print('r - restock')
        print('v - view')
        print('x - exit')

    def menu(self):
        choice = input('Choice(s/r/v/x): ')
        while choice != 'x':
            match(choice):
                case 's': self.sell()
                case 'r': self.restock()
                case 'v': self.view()
                case _: self.help()
            choice = input('Choice(s/r/v/x): ')

if __name__ == '__main__':
    shop = Shop()
    shop.menu()