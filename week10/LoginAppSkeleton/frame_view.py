from controller import Controller
import tkinter as tk
import tkinter.messagebox as mb

class ConfirmationView(tk.Toplevel):
    def __init__(self, master, msg):
        super().__init__(master=master)
        # Add a title
        # Set the geometry
        # Get the master x,y position
        # Place this window to the right side of the main window
        # Configure background color
        # Disable resizable
       
        # Add the correct label to the view to display the welcome message
        # Add the close button to close the confirmation view window


class LoginFrame(tk.LabelFrame):
    
    # Complete the constructor function 
    def __init__(self, master) -> None:
        super().__init__(master, text="Sign In")

        self.parent = master
        self.controller = Controller
        
        # Create a standalone window frame
        # Configure the columns weight 0 --> 1 and 1 --> 3

        # Add email label
        # Add password label
        self.email = tk.Label(self,text="Email")
        self.email.grid(column=0,row=0)
        self.password = tk.Label(self,text="Password")
        self.password.grid(column=0,row=1)

        self.emailText = tk.StringVar()
        self.emailField = tk.Entry(self,textvariable=self.emailText)
        self.emailField.grid(column=1,row=0)    

        self.passwordText = tk.StringVar()
        self.passwordField = tk.Entry(self,textvariable=self.passwordText,show="*")
        self.passwordField.grid(column=1,row=1,padx=5,pady=5)

        self.loginBtn = tk.Button(self,text="Login", command=self.login)
        self.loginBtn.gird(column=1,row=3)

        # On login-button action capture the email and password from fields
        # and compare the fields data with model data
        # Cancel button terminates the program

    # Complete the function clear to clear fields content
    def clear(self):
        pass # replace pass with the correct code
        self.emailField.delete(0,tk.END)
        self.passwordField.delete(0,tk.END)
        
    # Complete the login function to match input fields data with model data
    # - If the customer exist, open a new confirmation window with the welcome message
    # - If the credentials are incorrect open a pop-up error notification
    def login(self):
        # delegates the login action to controller
        user, message = self.controller.login(self.emailText.get(), self.passwordText.get())
        if user:
            ConfirmationView(self.parent, message)
        else:
            mb.showerror(title="Login Error", message=message)
        self.clear()    



        
