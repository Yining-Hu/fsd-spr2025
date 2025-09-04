# The Shop Application

The Shop application is composed of three classes: 
Shop, Product, CashRegister

The aim of this exercise is to practice OOP with Java.

## The CashRegister class:

* CashRegister has one field: cash
* CashRegister has one constructor that initializes the field to default
* CashRegister has the method ‘gain’ that updates the cash
* CashRegister has the method ‘pay’ that reduces the cash when restocking
* CashRegister has the method ‘isEmpty’ to check the cash is zero
* CashRegister has the method has(double cash) to check if there is enough money to pay for restocking
* Overrides the toString():
        to return: 
        “Cash level: $<cash-value>”
       	*[cash value should be formatted at 2 decimal points]*
        or return: 
        “Cash register is empty” if the cash level is zero

## The Product class:

* Product has three fields: type, price and quantity
* Product has two constructors: First initializes fields to parameters and the second initializes fields from user-inputs
* Define a method called ‘isEmpty’ to check the stock level 
* Define a method called ‘stocked’ that updates the stock level and returns the cash to pay for the stock
* Define a method called ‘sold’ that returns the cash earned from a sale and update the stock level
* Define a method has(int quantity) that checks if there is enough stock to sell
* Define a method cash(quantity) that returns the cash value as a result of a sale
* Override the toString():
        to return: 
        “<type-value> level: <quantity-value> at price $<price-value>”  
	    *[price value should be formatted at 2 decimal points]*
        or return: 
        “<type-value> stock level is: <quantity-value>” 
        if the stock level is zero

## The Shop class:
* Shop has two fields: one Product instance and one CashRegister instance
* Shop has a constructor that initializes the Product field using the constructor with parameters and initializes the CashRegister field using the default constructor
* Define a method called ‘sell’ that sells quantity of the product. 
	- read the quantity to sell from user-input
	- When the sale occurs, the cash amount gained from the sale should be updated in the cashRegister
	- Check if there is enough  stock to make a sale, otherwise display: “Not enough stock!”
* Define a method called ‘restock’ enables users to purchase stock of the product. 
	- Read the quantity to restock from user-input
	- When the restock occurs, the cash amount used for restocking should be deducted from the cashRegister cash level 
	- The stock level of this product should increase
	- Check if there is enough cash to make the purchase, otherwise display: “Not enough funds!”
* Define a method called ‘view’ that prints out the fields’ information
* Define a method called ‘menu’ that represents the Shop menu and provide users with 4 choices:
	( S ) – sell
	( R ) – restock
	( V ) – view
	( X ) – exit
	default : help()
* Define a method called ‘help’ that prints out the menu options
* Define the main() method should execute the system menu()

**NOTE:** define the necessary read functions in Shop


