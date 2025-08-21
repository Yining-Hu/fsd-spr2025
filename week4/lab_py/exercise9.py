import random as ran

correct = ran.randint(1,10)

guess = int(input("Guess = "))
while guess != correct:
    print('Sorry - try again')
    guess = int(input("Guess = "))
    
print(f'Success, secret number = {correct}')