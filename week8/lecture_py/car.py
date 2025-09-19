from abc import ABC, abstractmethod

class Car(ABC):
    def __init__(self,type):
        self.type = type
        
    @abstractmethod
    def move(self,distance):
        pass 
    
    @abstractmethod
    def position(self):
        pass 
    
    def show(self):
        print(self.type,end=" position = ")
        
    def __str__(self) -> str:
        return self.type
    
    