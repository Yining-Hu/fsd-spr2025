import tkinter as tk
from controller import UserController 
import tkinter.messagebox as mb

class ConfirmationView(tk.Toplevel):
    def __init__(self,parent,msg):
        super().__init__(master = parent)
        self.title("Confirmation Window")
        x = parent.winfo_x()
        y = parent.winfo_y()
        self.geometry("300x200+%d+%d" %(x+300,y))
        self.configure(bg="#607b8d")
        self.resizable(False,False)
        label = tk.Label(self,text=msg,fg="#ffc107",
                         font="Helvetica 12 bold",anchor="center")
        label.place(relx=0.5,rely=0.5,anchor="center")
        closeBtn = tk.Button(self,text="Close",command=lambda:self.destroy())
        closeBtn.pack(padx=5,pady=5,side="bottom")

class LoginFrame(tk.LabelFrame):
    def __init__(self,parent):
        super().__init__(parent, text="Sign In", bg="#607b8d", fg="white",
                         padx=20, pady=20, font="Helvetica 10 bold")
        self.parent = parent
        self.controller = UserController()
        self.columnconfigure(0,weight=1)
        self.columnconfigure(1,weight=3)
        self.place(relx=0.5,rely=0.5,anchor="center")

        self.email = tk.Label(self,text="Email",justify="left",fg="#ffc107",
                        font="Helvetica 12 bold",bg="#607b8d")
        self.email.grid(column=0,row=0,padx=5,pady=5,sticky="W")

        self.password = tk.Label(self,text="Password",fg="#ffc107",
                            font="Helvetica 12 bold",bg="#607b8d")
        self.password.grid(column=0,row=1,padx=5,pady=5,sticky="W")

        self.emailText = tk.StringVar()
        self.emailField = tk.Entry(self,textvariable=self.emailText)
        self.emailField.grid(column=1,row=0,padx=5,pady=5)
        self.emailField.focus()

        self.passwordText = tk.StringVar()
        self.passwordField = tk.Entry(self,textvariable=self.passwordText,show="*")
        self.passwordField.grid(column=1,row=1,padx=5,pady=5)

        self.cancelBtn = tk.Button(self,text="Cancel",command=parent.quit)
        self.cancelBtn.grid(column=1,row=3,sticky="W",padx=5,pady=5)
        self.loginBtn = tk.Button(self,text="Login",command=self.login)
        self.loginBtn.grid(column=1,row=3,sticky="E",padx=5,pady=5)

    def clear(self):
        # syntax: delete(start,end)
        self.emailField.delete(0,tk.END)
        self.passwordField.delete(0,tk.END)

    def login(self):
        user = self.controller.match(self.emailText.get(),self.passwordText.get())
        if user != None:
            info = f"Welcome {user.name}"
            ConfirmationView(self.parent, info)
            UserController.save(user)
            self.clear()
            print(UserController.read())
        else:
            info = "Incorrect email or password"
            mb.showerror(title="Login Error", message=info)
            self.clear()