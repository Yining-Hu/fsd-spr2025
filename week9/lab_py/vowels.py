import csv
import json
import os 

script_path = os.path.dirname(os.path.abspath(__file__))
txt_file = os.path.join(script_path,"vowels.txt")
csv_file = os.path.join(script_path,"vowels.csv")
json_file = os.path.join(script_path,"vowels.json")

def frequency(c, string):
    return string.lower().count(c)

def frequencies(string):
    data = {}
    for c in "aeiou":
        data[c] = frequency(c,string)
    return data
    
def save_to_txt(structure):
    handler = open(txt_file,'w')
    for data in structure:
        for key in data.keys():
            handler.write(f'{key} --> {data[key]}')
            handler.write("\n")
    handler.close()

def read_from_txt(file):
    handler = open(file,'r')
    structure = handler.read()
    print(structure)
    
def save_to_csv(structure):
    with open(csv_file,'w',newline='') as handler:
        writer = csv.writer(handler)
        for data in structure:
            for key in data.keys():
                writer.writerow([key,data[key]])
    handler.close()

def read_from_csv(file):
    with open(file, newline='') as csvfile:
        csvreader = csv.reader(csvfile)
        for row in csvreader:
            print(row)

def save_to_json(structure):
    with open(json_file,'w') as handler:
        json.dump(structure,handler,indent=2)
    handler.close()
        
def read_from_json(file):
    handler = open(file,'r')
    json_obj = json.load(handler)
    print(json.dumps(json_obj,indent=4))
    handler.close()
    
def run():
    structure = []
    s = input("String: ")
    while s != "*":
        structure.append(frequencies(s)) # list of dictionaries
        save_to_txt(structure)        
        save_to_csv(structure)        
        save_to_json(structure)
        s = input("String: ")
        
    read_from_txt(txt_file)
    read_from_csv(csv_file)
    read_from_json(json_file)
run()