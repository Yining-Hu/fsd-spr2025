n = int(input('n = '))

f1 = 1
f2 = 1

print(f1)

while (f2 < n):
    fn = f1 + f2
    f1 = f2
    f2 = fn
    print(f1)

