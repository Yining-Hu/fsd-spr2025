import math as m 

radius = float(input('radius = '))
area = m.pi*m.pow(radius,2)
volume = (4/3)*m.pi*pow(radius,3)

print(f'Circle of \"{radius:.2f}\" is: {area:.2f}')
print(f'Sphere of \"{radius:.2f}\" is: {volume:.2f}')