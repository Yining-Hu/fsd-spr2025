class Car:
    def __init__(self) -> None:
        self.make = "BMW"
        self.pos = 0

    def move(self,distance):
        self.pos += distance

    def __str__(self):
        return f'{self.make} is at position {self.pos}'

    def main():
        myCar = Car()
        print(myCar)
        myCar.move(15)
        print(myCar)

if __name__=="__main__":
    Car.main()