# Race Track with Python

The Race Track program is composed of 3 scripts: 
-   car.py 
-   cars.py
-   ractrack.py

the aim of this program is to improve the knowledge of OOP principles

## The car script:
The car script includes the Car abstract class. The Car abstract class has:

*   constructor to initialize the car type
*   abstract method move to add the distance moved to the car position
*   abstract method position to return the car position
*   method show to display *type+" position = "*
*   method __str__ that returns the car type
   
## The cars script:
The cars script has the BMW class and the Audi class that inherit Car
*   the cars constructor should initialize the position
*   the cars override the move method
*   the cars override the position method
*   the cars have the show method to show type and position

## The racetrack script:
The racetrack script has the RaceTrack class
*   RaceTrack constructor initializes an empty list
*   Define a procedure 'register' add 2 BMW and 2 Audi cars
*   Define a procedure 'move' to move all cars
*   Define a procedure 'show' to show all cars
*   Define a function 'winner' to return the winning car (max position)
*   Define the main system menu that offers the following choices:
    -   r: register cars
    -   m: move cars
    -   s: show cars
    -   x: exit

    * On exit the program should show the winning car and its position




  
