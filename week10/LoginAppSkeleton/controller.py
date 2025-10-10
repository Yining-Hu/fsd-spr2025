from model import Database

# Controller class is completed
class Controller():
    def __init__(self):
        self.model = Database()

    def login(self,email,password):
        # compares the entered user details with records on the DB using self.model.match
        pass