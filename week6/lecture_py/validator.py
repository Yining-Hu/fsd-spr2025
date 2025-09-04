import patterns as p
import re 

class Validator:
    
    @staticmethod
    def match(email,password):
        return p.email == email and p.password == password
    
    @staticmethod
    def validEmail(email):
        return re.fullmatch(p.EMAIL_PATTERN,email)
    
    @staticmethod
    def validPassword(password):
        return re.fullmatch(p.PASSWORD_PATTERN,password)
    