import math as m 

x1 = float(input("x1 = "))
y1 = float(input("y1 = "))
x2 = float(input("x2 = "))
y2 = float(input("y2 = "))
distance = m.sqrt(pow(x1-x2,2) + pow(y1-y2,2))
print(f'The distance between A({x1},{y1}) and B({x2},{y2}) is: {distance:.2f}')