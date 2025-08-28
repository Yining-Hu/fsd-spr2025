def print_space(n, l):
    space = n - l
    print(" " * space, end="")

def print_stars(n):
    print("* " * n, end="")
    print()

def generate_nums(n):
    length = 2 * n - 1
    nums = []
    for i in range(n):
        nums.append(i + 1)
    for i in range(n, length):
        nums.append(2 * n - i - 1)
    return nums

def main():
    n = 5
    nums = generate_nums(n)
    for num in nums:
        print_space(n, num)
        print_stars(num)

main()