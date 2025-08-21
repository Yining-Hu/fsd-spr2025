# Calculate and show the factorial series of a range
# range starts from 1 to n included
# n is from STDIN

import math as m 

n = int(input("n = "))

for e in range(1,n+1):
    f = 1
    for i in range(1,e+1):
        f *= i 
    print(f'Factorial({e}) = {f}')
    
print()

for e in range(1,n+1):
    print(f'Factorial({e}) = {m.factorial(e)}')
