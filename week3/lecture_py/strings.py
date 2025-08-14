s = "Python is easy 2023"

length = len(s) # returns the length of s

print("length = "+str(length))

print(s[0])
print(s[length - 1])

print(s[2:6]) # prints string slice from position 2 until 5
print(s[int(length/2):])

print(s.count('2'))

print(s.lower())
print(s.upper())

print(s.index('2'))
print(s.find('2'))
print(s.replace('easy','FSD'))

print(s.isalpha())
print(s.isnumeric())
print(s.isalnum())
