n = int(input('n = '))

while n != -1:
    total = 0
    for i in range(1,n+1):
        if i%2 == 0:
            total += i
    print(f'Even-sum of {n} is {total}')
    n = int(input('n = '))