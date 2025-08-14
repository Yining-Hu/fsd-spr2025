x = 2
y = 3.5

x +=1   # x = x + 1
x -= y  # x = x - y
x /=3   # x = x / 3
x *= 2  # x = x * 2
x %= 2  # x = x%2

print(f'{x**2:.3f}')

print(x is not y)
print(not(x is y))
print(not(x == y))

b = (x >= y or not(x != y)) and (x is y or (x < y))

print(b)