import random as ran

class Numbers:
    def __init__(self):
        self.numbers = []

    def populate(self):
        if len(self.numbers) == 0:
            self.numbers = [ran.randint(0, 101) for _ in range(int(input('Size = ')))]
        else:
            print('List is not empty')

    def clear(self):
        self.numbers.clear()

    def show(self):
        print(self.numbers)

    # checks if the target exists in random integer list
    def number(self, number):
        return self.numbers.count(number) > 0

    def find(self, target):
        if self.number(target):
            print(f'{target} is at position {self.numbers.index(target)}')
        else:
            print(f'{target} does not exist')

    def findAll(self, target):
        if self.number(target):
            temp = [i for i, value in enumerate(self.numbers) if value == target]
            print(f'{target} is at positions {temp}')
        else:
            print(f'{target} does not exist')

    # delete all occurences of the target
    def delete(self, target):
        if self.number(target):
            temp = [item for item in self.numbers if item != target]
            self.numbers = temp
            print(f'The updated list is {temp}')
        else:
            print(f'{target} does not exist')

    def update(self):
        value = int(input('Value: '))
        pos = int(input("Position: "))
        self.numbers.insert(pos, value)
        
    def view(self):
        print(self.numbers)

    def menu(self):
        choice = input('Choice(p/c/f/F/d/u/v/x): ')

        while choice != 'x':
            match choice:
                case 'p': self.populate()
                case 'c': self.clear()
                case 'f': self.find(int(input('Target: ')))
                case 'F': self.findAll(int(input('Target: ')))
                case 'd': self.delete(int(input('Target: ')))
                case 'u': self.update()
                case 'v': self.view()
                case _: print('Unknown choice')
            choice = input('Choice(p/c/f/F/d/u/v/x): ')


def main():
    Numbers().menu()

if __name__ == '__main__':
    main()
