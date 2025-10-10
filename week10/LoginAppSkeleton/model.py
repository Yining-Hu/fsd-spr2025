import datetime as dt

# The User class is completed
class User:
    def __init__(self, name, email, password):
        self.name = name
        self.email = email
        self.password = password

    def match(self, email, password):
        return self.email == email and self.password == password

    def __str__(self) -> str:
        tz = dt.datetime.now().astimezone().tzname()
        local = dt.datetime.now().strftime("%m/%d/%Y, %H:%M:%S")
        return f'[User: {self.name}] [Action: Login] [{tz} - {local}]'

# The Database class is completed
class Database:
    def __init__(self):
        self.users = [User('Tom Shulz', 'tom.s@test.com', 'tom222'),
                      User('Alana Cruz', 'alana.c@test.com', 'alana111'),
                      User('Mathias Summer', 'summer.m@test.com', 'mat222')]

    def match(self, email, passord):
        for user in self.users:
            if user.match(email, passord):
                return user
        return None

# the Logger class is complete
class Logger:
    @staticmethod
    def save(user):
        handler = open("./log.txt","a+")
        handler.write(str(user))
        handler.write("\n")
        handler.close()

    @staticmethod
    def read():
        handler = open("./log.txt","r")
        data = handler.readlines()
        lines = []
        for line in data:
            if not(line.isspace()):
                filtered = line.replace("\n","")
                lines.append(filtered)
        return lines