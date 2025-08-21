import random as ran 

n = int(input('n = '))
ran.seed(10)

total = 0
for i in range(n):
    value = ran.randint(0,1000)
    if value % 2 == 0:
        total += value
print(f'Total = {total}')
    
