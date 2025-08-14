name = "Tom"
balance = 12.4567

# Method 1: use the plus to concatenate the output
print(name+" has $"+str(balance))

# Method 2: print values next to each other
print(name+" has $",balance)

#Method 3: use formatting modes
print("%s has $%.2f"%(name,balance))
print("%10s has $%15.2f"%(name,balance))
print("%-10s has $%-15.2f"%(name,balance))

#Method 4: using the format function from string
print("{} has ${}".format(name,balance))
print("{:10} has ${:15.3f}".format(name,balance))
print("{:10} has ${:<15.3f}".format(name,balance))
print("{:10} has ${:0>15.3f}".format(name,balance))
print("{:*^10} has ${:0>15.3f}".format(name,balance))

#Method 5: using the f command
print(f'{name} has ${balance}')
print(f'{name} has ${balance:^15.3f}')