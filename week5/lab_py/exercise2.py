import random
import math

def generate_random_numbers(n):
    return [random.randint(0, 100) for _ in range(n)]

def calculate_mean(array):
    return sum(array) / len(array)

def calculate_standard_deviation(array):
    mean = calculate_mean(array)
    variance = sum((x - mean) ** 2 for x in array) / len(array)
    return math.sqrt(variance)

def show_calculated_values(array):
    mean = calculate_mean(array)
    std_dev = calculate_standard_deviation(array)
    print(f'Mean: {mean:.2f}')
    print(f'Standard Deviation: {std_dev:.2f}')

# Generate 20 random numbers
random_numbers = generate_random_numbers(20)

# Show the calculated values
show_calculated_values(random_numbers)
