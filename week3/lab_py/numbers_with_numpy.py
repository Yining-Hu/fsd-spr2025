import numpy as np

class Numbers:
    def __init__(self):
        pass
    
    def main():
        n = int(input("n = "))
        numbers = np.zeros(n, dtype=int)
        print(numbers)
        numbers[0] = 10
        numbers[-1] = -5
        numbers[round(n/2)] = 3
        print(numbers)

if __name__ == "__main__":
    Numbers.main()