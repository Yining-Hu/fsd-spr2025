# Read rain until -1
# Determine and show the longest dry spell
# [A dry spell is the number of days with no rain ]
import sys

rain = int(input("Rain: "))
count = 0
maximum = -sys.maxsize

while rain != -1:
    if rain == 0:
        count += 1
    else:
        maximum = max(count, maximum)
        count = 0
    rain = int(input("Rain: "))
    
maximum = max(maximum,count)  
print(f'Longest dry spell = {maximum}')