class Bank:
    balance = 1000

    def main(self):
        print("Starting balance is ", self.balance)

        # strip() removes the extra whitespaces from the start and end
        c = input("Start banking (d/w/s/x): ").strip()

        while (c!="x"):
            match c:
                case "d":
                    inpt = input("Amount to deposit $")
                    deposit = float(inpt)
                    self.balance += deposit
                    print(f'Amount ${deposit:.2f} deposited')

                case "w":
                    inpt = input("Amount to withdraw $")
                    withdraw = float(inpt)
                    if (withdraw <= self.balance):
                        self.balance -= withdraw
                        print(f'Amount ${withdraw:.2f} withdrawn')
                    else:
                        print("Insufficient funds!")

                case "s":
                    print("Current balance is ", self.balance)

                case _:
                    print("Available options (d/w/s/w).")

            c = input("Continue banking (d/w/s/x): ").strip()

if __name__ == "__main__":
    my_bank = Bank()
    my_bank.main()