from datetime import datetime
import os
import pickle

script_path = os.path.dirname(os.path.abspath(__file__))
CUSTOMER_FILE = os.path.join(script_path,"customers.data")

DTF = "%d/%m/%Y - %H:%M:%S"
NOW = datetime.now()

def initialize():
    try:
        customers = []
        if not os.path.exists(CUSTOMER_FILE):
            with open(CUSTOMER_FILE, 'wb') as f:
                pickle.dump(customers, f)
    except Exception as ex:
        print("Error occurred during initialization:", ex)

def read_from_file():
    customers = []
    try:
        with open(CUSTOMER_FILE, 'rb') as file_in:
            customers = pickle.load(file_in)
    except FileNotFoundError as ex:
        print("File Not Found: %s", ex)
    except IOError as ex:
        print("Reading Error: %s", ex)
    except EOFError as ex:
        print("End of File Error: %s", ex)
    return customers

def write_to_file(customers):
    try:
        with open(CUSTOMER_FILE, 'wb') as file_out:
            pickle.dump(customers, file_out)
    except FileNotFoundError as ex:
        print("File Not Found: %s", ex)
    except IOError as ex:
        print("Reading Error: %s", ex)