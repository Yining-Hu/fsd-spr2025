from bank import Bank
from manager import Manager
from config import DTF,NOW

def read_choice():
    print(f'Bank menu (L/A/X) {NOW.strftime(DTF)} Please select:', end="")
    return input().strip().upper()

def help():
    print("Menu options")
    print("L = Log in as a customer.")
    print("A = Log in as the manager.")
    print("X = Exit.")

if __name__ == "__main__":
    bank = Bank()
    manager = Manager(bank)

    choice = read_choice()
    while choice!='X':
        match choice:
            case 'L':
                bank.customer_login()
            case 'A':
                manager.use()
            case _:
                help()
        choice = read_choice()