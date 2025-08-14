import sys

x = int(input("x =  "))

y = int(input("y =  "))

print("x + y = "+str(x + y))

"""
sys.argv values need to be entered when executing the code
For example: python3 lectures/lecture3/inputs.py 5 6
"""
a = float(sys.argv[1])
b = float(sys.argv[2])

print(a + b)