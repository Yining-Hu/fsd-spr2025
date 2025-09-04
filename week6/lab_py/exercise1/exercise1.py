# Unlike Java, Python does not offer multiple constructors option
# Instead Python offers a work-around using class methods

class Person:
    
    def __init__(self,name, age):
        self.name = name
        self.age = age
        
    @classmethod
    def default_constructor(cls):
        return cls('',0)
        
    def get_name(self):
        return self.name
    
    def get_age(self):
        return self.age 
    
    def set_name(self,name):
        self.name = name 
        
    def set_age(self,age):
        self.age = age 
        
    def __str__(self) -> str:
        return f'{self.name} age is {self.age}'

class People:
    def __init__(self):
        self.first = Person.default_constructor()
        self.second = Person('Tom',33)
        
    def show(self):
        print(self.first)
        print(self.second)
        
    def update(self,Person, name):
        Person.name = name 
        
def main():
    people = People()
    people.show()
    people.update(people.first,'Alex')
    people.update(people.second,'Tom Jones')
    people.show()

if __name__ == "__main__":
    main()