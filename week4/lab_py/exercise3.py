
n = int(input('n = '))

while n != 0:
    [print('*',end='') for _ in range(n)]
    print()
    n = int(input('n = '))