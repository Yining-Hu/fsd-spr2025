from controller import UserController
import tkinter as tk
import tkinter.messagebox as mb

class ConfirmationView(tk.Toplevel):
    def __init__(self, parent, msg):
        super().__init__(master=parent)
        # Add a title
        # Set the geometry
        # Get the parent x,y position
        # Place this window to the right side of the main window
        # Configure background color
        # Disable resizable
       
        # Add the correct label to the view to display the welcome message
        # Add the close button to close the confirmation view window


class LoginFrame(tk.LabelFrame):
    
    # Complete the constructor function 
    def __init__(self, parent) -> None:
        super().__init__(parent)
        
        # Create a standalone window frame
        # Configure the columns weight 0 --> 1 and 1 --> 3

        # Add email label
        # Add password label

        # On login-button action capture the email and password from fields
        # and compare the fields data with model data
        # Cancel button terminates the program

    # Complete the function clear to clear fields content
    def clear(self):
        pass # replace pass with the correct code
        
    # Complete the login function to match input fields data with model data
    # - If the customer exist, open a new confirmation window with the welcome message
    # - If the credentials are incorrect open a pop-up error notification
    def login(self):
        pass # replace pass with the correct code