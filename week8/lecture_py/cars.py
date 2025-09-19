from car import Car

class BMW(Car):
    def __init__(self, type, position):
        super().__init__(type)
        self.pos = position
        
    def move(self, distance):
        self.pos += distance + 4
        
    def position(self):
        return self.pos
    
    def show(self):
        super().show()
        print(self.pos)
        
        
class Audi(Car):
    def __init__(self, type, position):
        super().__init__(type)
        self.pos = position
        
    def move(self, distance):
        self.pos += distance + 2
        
    def position(self):
        return self.pos
    
    def show(self):
        super().show()
        print(self.pos)