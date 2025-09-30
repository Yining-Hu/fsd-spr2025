from model import Database

class UserController:
    def __init__(self):
        self.model = Database()

    def match(self,email,password):
        return self.model.match(email,password)

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