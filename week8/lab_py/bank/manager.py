from config import DTF,NOW

class Manager:
    def __init__(self,bank):
        self.name = "John Smith"
        self.bank = bank

    def view(self):
        self.bank.view()

    def show(self):
        self.bank.show()

    def remove(self):
        self.bank.remove()

    def add(self):
        self.bank.add()

    def read_choice(self):
        print("Manager menu (a/r/v/s/x): ", end="")
        return input().strip().lower()
    
    def use(self):
        print(f'{self.name} admin menu: {NOW.strftime(DTF)}')
        c = self.read_choice()
        while c!='x':
            match c:
                case 'a':
                    self.add()
                case 'r':
                    self.remove()
                case 's':
                    self.show()
                case 'v':
                    self.view()
                case _:
                    self.help()
            c = self.read_choice()
        print("Back to Bank menu")

    def help(self):
        print("Menu options")
        print("a = add a customer")
        print("r = remove a customer")
        print("v = view all customers")
        print("s = show the selected customer")
        print("x = exit")