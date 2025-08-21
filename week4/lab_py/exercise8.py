n = int(input('n = '))

while n != -1:
    f = 1
    for i in range(2,n+1):
        f *= i
    print(f'Factorial({n}) = {f}')
    n = int(input('n = '))