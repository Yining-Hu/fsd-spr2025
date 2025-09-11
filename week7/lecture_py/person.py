import random as ran 
import pprint as pp 

def uniq_ids(first,last,size):
    return list(set(ran.sample(range(first,last),size)))

def records(keys):
    names = {}
    for key in keys:
        names[key] = input("Name: ")
    return names

def create(names, key, name):
    names[key] = name 

def read(names, ID):
    return names[ID]

def update(names, ID, name):
    names[ID] = name 
    
def delete(names, ID):
    del names[ID]
    
def view(names):
    pp.pprint(names,width=20)
    