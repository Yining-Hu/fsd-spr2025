import re 

email = "john.smith@example.com.au"
password = "Admin_1234"

EMAIL_PATTERN = r'\b[A-Za-z]+[.-_][A-Za-z]+@[A-Za-z]{3,}\.com\.au\b'
PASSWORD_PATTERN = r'\b[A-Z][a-z]{4,}[@_#-][0-9]{3,}\b'