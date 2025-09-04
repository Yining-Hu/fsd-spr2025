import validator as v

class Person:
    def __init__(self, name,email,password):
        self.name = name
        self.email = email
        self.password = password
        
    def login(self):
        return v.Validator.match(self.email,self.password)
    
    def validEmail(self):
        return v.Validator.validEmail(self.email)
    
    def validPassword(self):
        return v.Validator.validPassword(self.password)
    
p = Person(input("Name: "), input("Email: "), input("Password: "))

if not(p.validEmail()):
    print("Incorrect email format")
elif not(p.validPassword()):
    print("Incorrect password format")
else:
    if p.login():
        print(f'Welcome {p.name}')
    else:
        print("Incorrect credentials")