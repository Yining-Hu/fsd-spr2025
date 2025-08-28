import math as m

def perimeter(radius):
    return 2*m.pi*radius

def area(radius):
    return m.pi*pow(radius,2)

def volume(radius):
    return (4/3)*m.pi*pow(radius,3)

def show():
    radius = float(input("Radius = "))
    print(f'Perimeter = {perimeter(radius):.3f}')
    print(f'Area = {area(radius):.3f}')
    print(f'Volume = {volume(radius):.3f}')
    
show()