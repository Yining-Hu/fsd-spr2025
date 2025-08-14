n = int(input("Enter the length of your list: "))
numbers = [0] * n
print(numbers)
numbers[0] = 10
numbers[-1] = -5
numbers[round(len(numbers)/2)] = 3
print(numbers)