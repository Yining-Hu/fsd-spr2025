import sys 

n = int(input('n = '))

minimum = sys.maxsize
maximum = -sys.maxsize

while n != -1:
    if maximum <= n:
        maximum = n 
    if minimum >= n:
        minimum = n
    n = int(input('n = '))
    
print(f'Min = {minimum}')
print(f'Max = {maximum}')