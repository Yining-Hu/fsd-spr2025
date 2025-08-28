# Read an integer n from STDIN
# Calculate and show
# 1 - sum series of n
# 2 - factorial of n

def sum_series(n):
    S = lambda n: n+ S(n-1) if n > 1 else 1
    return S(n)

def factorial(n):
    F = lambda n: n * F(n-1) if n > 1 else 1
    return F(n)

def run():
    n = int(input("n = "))
    print(f'Sum_series({n}) = {sum_series(n)}')
    print(f'Factorial({n}) = {factorial(n)}')
    
run() 