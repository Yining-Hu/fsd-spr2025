import math as m

"""
{"i":3^s}
* "i" is the string to be formatted.
* ^ is the center alignment operator; < for left alignment; > for right alignment
* 3 is the width within which the string will be centered.
"""
header = f'| {"i":^3s} | {"sqrt":^7s} | {"exp":^9s} |'

"""
* [...] (list comprehension) is used to repeatedly execute the print function.
* print('-', end='') prints a hyphen and stays on the same line.
* The iterations are defined by "for _ in range(len(header))"; _ is not needed in the loop body
"""
[print('-',end='') for _ in range(len(header))]
print('\n'+header)
[print('-',end='') for _ in range(len(header))]
print()
for i in range(1,11):
    print(f'| {i:^3d} | {m.sqrt(i):^7.2f} | {m.exp(i):^9.2f} |')
[print('-',end='') for _ in range(len(header))]
print()
