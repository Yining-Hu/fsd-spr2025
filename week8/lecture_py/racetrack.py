from cars import BMW
from cars import Audi

import random as ran

class RaceTrack:
    def __init__(self):
        self.cars = []
        
    def register(self):
        self.cars.clear()
        self.cars.append(BMW("M3",0))   
        self.cars.append(BMW("M5",0)) 
        self.cars.append(Audi("A6",0)) 
        self.cars.append(Audi("TT",0))  
        
    def move(self):
        for car in self.cars:
            car.move(ran.randint(5,10))
        
    def show(self):
        for car in self.cars:
            car.show()
            
    def winner(self):
        maximum = 0
        for car in self.cars:
            if car.position() > maximum:
                maximum = car.position()
                winner = car 
        return winner
    
def main():
    rt = RaceTrack()
    
    choice = input("Choice(r/m/s/x): ")
    
    while choice !="x":
        match choice:
            case 'r': rt.register()
            case 'm': rt.move()
            case 's': rt.show()
            case _ :print("Unknown choice!")
        choice = input("Choice(r/m/s/x): ")
    print(f'Winner {rt.winner()} --> {rt.winner().position()}')    
    
main()