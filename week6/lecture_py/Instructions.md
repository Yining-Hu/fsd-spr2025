# RegEX with Python

A person logging in enters email and password into the system.
The system validates the email and password formats against RegEx patterns.
Then system validates the correctness of email and password.

## The Login system:
The Login system is composed of 3 Python scripts:

*   patterns script containing the correct email and password.
    The patterns script contains the constant email and password RegEx

*   validator script containing the class Validator.
    The Validator class includes static-functions to validate:
    *   email format
    *   password format
    *   email and password correctness
  
*   person script containing the Person class.
    *   The Person class is known by name, email and password
    *   The Person class has functions to:
        *   validate email
        *   validate password
        *   check email and password correctness
  
**TEST CASE:** 
-   create a person object with fields data from STDIN. 
-   test if the person's credentials format is correct
-   test if the person's credentials are correct