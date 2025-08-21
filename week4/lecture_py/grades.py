# Read a student name from STDIN
# Pass the mark from command line argument
# Compute and show the grade
import sys 

name = input("Student name: ")
mark = int(sys.argv[1])

if mark >= 85:
    grade = "HD"
elif mark >= 75:
    grade = "D"
elif mark >= 65:
    grade = "C"
elif mark >= 50:
    grade = "P"
else:
    grade = "Z"
    
print(f'{name} mark is {mark} and grade is {grade}')