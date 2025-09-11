import person 

def exist(data,ID):
    for key in data.keys():
        if key == ID:
            return True
    return False

def records():
    data = {}
    first = int(input("First = "))
    last = int(input("Last = "))
    size = int(input("Size = "))
    keys = person.uniq_ids(first,last,size)
    data = person.records(keys)
    return data

data = records()

def create():
    key = int(input("ID = "))
    
    if not(exist(data,key)):
        value = input("Name: ")
        person.create(data, key,value)
    else:
        print("There is a record associated with the key ",key)
        
def read():
    key = int(input("ID = "))
    if exist(data,key):
        print(f'{key} --> {person.read(data,key)}')
    else:
        print(f'no record associated with the key {key}')

def update():
    key = int(input("ID = "))
    if exist(data,key):
        value = input("Name: ")
        person.update(data,key,value)
    else:
        print(f'no record associated with the key {key}')
        
def delete():
    key = int(input("ID = "))
    if exist(data,key):        
        person.delete(data,key)
    else:
        print(f'no record associated with the key {key}')
        
def view():
    person.view(data)
    
def menu():
    choice = input("choice(c/r/u/d/v/x): ")
    
    while choice != "x":
        match choice:
            case 'c': create()
            case 'r': read()
            case 'u': update()
            case 'd': delete()
            case 'v': view()
            case _ : print("Unknown choice!")
        choice = input("choice(c/r/u/d/v/x): ")
        
menu()   
