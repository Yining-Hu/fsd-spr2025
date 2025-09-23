import csv
import random
import os 

script_path = os.path.dirname(os.path.abspath(__file__))
grades_file = os.path.join(script_path,"grades.csv")

class Student:
    def __init__(self, name, mark):
        self.name = name
        self.mark = mark
        self.grade = self.calculate_grade()

    def calculate_grade(self):
        if self.mark >= 85:
            return "HD"
        elif self.mark >= 75:
            return "D"
        elif self.mark >= 65:
            return "C"
        elif self.mark >= 50:
            return "P"
        else:
            return "Z"

    def __str__(self):
        return f'{self.name} -> {self.grade}'
    
class Faculty:
    def __init__(self):
        self.students = {}

    def enroll_students(self):
        for i in range(100, 110):
            name = f'Student_{i}'
            mark = random.randint(1, 100)
            student = Student(name, mark)
            self.students[name] = student

    def save(self):
        with open(grades_file, "w", newline='') as file:
            writer = csv.writer(file)
            writer.writerow(["Name", "Mark", "Grade"])
            for student in self.students.items():
                writer.writerow([student[1].name, student[1].mark, student[1].grade])

    def show(self):
        try:
            with open(grades_file, "r") as file:
                reader = csv.reader(file)
                for row in reader:
                    print(row)
        except(FileNotFoundError):
            print("grades.csv doesn't exist, please save the student records first.")

    def read_choice(self):
        return input("Menu: (e) enroll, (s) save, (v) show, (x) exit: ").strip().lower()
    
    def help(self):
        print("Menu options (e/s/v/x)")
        print("(e) enrol - adds 10 students with IDs ranging from 100 to 109 with randomly generated marks")
        print("(s) save - save the student records to the grades.csv file ")
        print("(v) show - read and show csv content")
        print("(x) exit")

    def menu(self):
        choice = ''
        while choice != 'x':
            choice = self.read_choice()
            if choice == 'e':
                self.enroll_students()
            elif choice == 's':
                self.save()
                print("Students saved to grades.csv")
            elif choice == 'v':
                print("Contents of grades.csv:")
                self.show()
            else:
                self.help()
        print("Goodbye!")

if __name__ == "__main__":
    Faculty().menu()
    
