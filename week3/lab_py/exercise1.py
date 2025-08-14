import math as m

x = 4
y = 2
sr = "\u221A"
print(f'x + y = {x+y:.3f}')
print(f'x - y = {x-y:.3f}')
print(f'x / y = {x/y:.3f}')
print(f'x * y = {x*y:.3f}')
print(f'x % y + x / y = {x % y + x / y:.3f}')
print(f'(y^7 + 7 / ({sr}5+x)) * (x^4 % 5 + 2) = {(y**7+7/(math.sqrt(5)+x))*(x**4%5+2):.3f}')
