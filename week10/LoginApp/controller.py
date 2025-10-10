from model import Database, Logger

class UserController:
    def __init__(self):
        self.model = Database()
    
    def login(self, email, password):
        # returns the user if matches, otherwise returns None
        user = self.model.match(email,password)
        if user:
            Logger.save(user)
            return user, f"Welcome {user.name}"
        else:
            return None, "Incorrect email or password"