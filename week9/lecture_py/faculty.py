import os
import sys
import random as ran
import student as s

def filepath():
    scriptpath = os.path.abspath(sys.argv[0])
    scriptdir = os.path.dirname(scriptpath)
    return scriptdir+"/"
    # for Windows system this line should be return scriptdir+"\\"

def read():
    path = filepath()
    file = input("Read csv file: ")
    s.read_from_csv(path+file)
    s.read_with_pandas(path+file)
    
def write():
    path = filepath()
    file = input("Write to csv file: ")
    name = input("Name: ")
    mark = int(input("Mark: "))
    grade = s.grade(mark)
    id = ran.randint(100000,999999)
    s.write_to_csv(path+file,id,name,mark,grade)
    
def main():
    choice = input("Choice(r/w/x): ")
    
    while choice != "x":
        match choice:
            case 'r': read()
            case 'w': write()
            case _: print("Unknown choice")
        choice = input("Choice(r/w/x): ")
        
main()