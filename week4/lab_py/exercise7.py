"""
Python does not have a character type, a single character is a string with a length of 1
"""
c = input("Character: ").strip()[0]
count = 0

while c != ".":
    """
    * s.count(substring) returns the number of non-overlapping occurrences of substring in s.
    * Here it is used to check if the lowercase c is a vowel.
    """
    count += "aeiou".count(c.lower())
    c = input("Character: ").strip()[0]
    
print(f'Vowel count = {count}')
        