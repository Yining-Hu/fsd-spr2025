# People Registry with Python

The people register program is composed of 2 scripts: person.py and people.py

the aim of this program is to improve the knowledge of data structure (lists, dictionary) with Python.

## The Person script:
The person script is composed of the following steps:

*   Define a function 'unique_ids' to generate a random list of: first, last, size
    *   ensure that all IDs in the list are unique
*   Define a function 'records' to create a dictionary of person:
    *   use the previous function to create random list of IDs of size 3-digits
    *   for each ID in the list read a person's name from STDIN
    *   create an return a dictionary composed of (k,v) --> (ID,name)
*   Define a function 'create' to add a person to the dictionary
*   Define a function 'read' to find and return a person from dictionary
*   Define a function 'update' to update a person's name by ID
*   Define a function 'delete' to delete a person by ID
*   Define a function 'view' to show the dictionary formatted as JSON
   
## The People script:
The people script is composed of the following steps:
*   Define a function 'exist' to check if a person exist in the dictionary
*   Define a function 'records' to:
    *   read in: first, last, size from STDIN
    *   generate a list of IDs [3-digits]
    *   return a dictionary of records (k,v) --> (ID, name)
*   Define a function 'create' to add a new person if they don't exist
    *   read ID and name from STDIN
*   Define a function 'read' to retrieve a person's record if they exist
    *   read ID from STDIN
*   Define a function 'update' to update a record name by ID if they exist
    *   read ID and name from STDIN
*   Define a function 'delete' to delete a record by ID if they exist
    *   read ID from STDIN
*   Define a function to show all records as JSON
*   Define the main system menu that offers the following choices:
    -   c: create a record
    -   r: read a record
    -   u: update a record
    -   d: delete a record
    -   v: view a record
    -   x: exit

# Georges034302 / fsd_python



  
