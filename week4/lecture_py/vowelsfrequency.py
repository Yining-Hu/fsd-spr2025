# Read a string from STDIN until *
# Determine the frequency of each vowel in the string
# Determine the total number of vowels in the string
# Show the values 

s = input("String: ")

while s != "*":
    total = 0
    for c in "aeiou":
        frequency = s.lower().count(c)
        total += frequency
        print(f'{c} --> {frequency:03}')
    print(f"Total vowels = {total}")
    s = input("String: ")