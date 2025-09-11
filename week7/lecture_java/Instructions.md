# The Faculty Application

The Faculty application is composed of two classes: 
Student and Faculty

The aim of this exercise is to practice collections operations with Java

## The Student class:
* Student has 3 fields: ID, mark, grade
* Student has one constructor that initializes the fields ID and mark from parameters. The grade auto-calculated based on the mark
* Student has 2 get methods to return the ID and mark
* Student has the method ‘match’ to match and ID with the field ID
* Student has the method ‘grade’ to return the grade based on a mark
* Student has the toString() to return: "Student-ID [mark -->grade] "

## The Faculty class:
* Faculty has one field: a list of students
* Faculty has a constructor to initialize the list of students
* Faculty has the method ‘match’ to match a student in a list with an ID. The purpose is to check if the student exists in the list.
* Faculty has the method 'uniqueID' to return a random unique 3-digits ID (none existing in the student list)
* Faculty has the method 'mark' to return a random mark between 0 and 100
* Faculty has the method 'register' to add 10 students to the list
* Faculty has the method 'view' to show all students in the list
* Faculty has the method 'partition' to show students partitioned by pass/fail
* Faculty has the method 'groupByGrade' to organize and show students by grade
* Faculty has the method 'clear' to remove all students from the list
* Faculty has the method ‘menu’ that represents the Faculty menu and provide users with 6 choices:
	-   ( r ) – register 10 students
  	-	( c ) – clear student list
	-	( g ) – group by grades
    -	( p ) – partition by pass/fail   
    -	( v ) – view all students
	-	( X ) – exit
	-	default : help()
* Define a method called ‘help’ that prints out the menu options
* Define the main() method should execute the system menu()

**NOTE:** define the necessary read functions in Faculty