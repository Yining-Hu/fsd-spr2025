class Bank:
    def main():
        inpt = input("Amount to deposit $")
        deposit = float(inpt)
        print(f'Amount ${deposit:.2f} deposited')

        inpt = input("Amount to withdraw $")
        withdraw = float(inpt)
        print(f'Amount ${withdraw:.2f} withdrawn')

if __name__ == "__main__":
    Bank.main()
