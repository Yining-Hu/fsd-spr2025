from datetime import datetime
import pickle,logging,os

DTF = "%d/%m/%Y - %H:%M:%S"
NOW = datetime.now()

CUSTOMER_FILE = "./customers.data"

def initialize():
    try:
        customers = []
        if not os.path.exists(CUSTOMER_FILE):
            with open(CUSTOMER_FILE, 'wb') as f:
                pickle.dump(customers, f)
    except Exception as ex:
        logging.error("Error occurred during initialization:", ex)

def read_from_file():
    customers = []
    try:
        with open(CUSTOMER_FILE, 'rb') as file_in:
            customers = pickle.load(file_in)
    except FileNotFoundError as ex:
        logging.error("File Not Found: %s", ex)
    except IOError as ex:
        logging.error("Reading Error: %s", ex)
    except EOFError as ex:
        logging.error("End of File Error: %s", ex)
    return customers

def write_to_file(customers):
    try:
        with open(CUSTOMER_FILE, 'wb') as file_out:
            pickle.dump(customers, file_out)
    except FileNotFoundError as ex:
        logging.error("File Not Found: %s", ex)
    except IOError as ex:
        logging.error("Reading Error: %s", ex)
