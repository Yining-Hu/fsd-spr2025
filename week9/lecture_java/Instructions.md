# The Game Application

The Game application is composed of 3 classes
Player, PlayerDAO, and Game

The aim of this exercise is to practice Java I/O and exception handling with Java

## The Player class

* Player has 2 fields: name and score
* Player constructor initializes the fields as follows:
  * name is formatted as "Player_2-digit"
  * score is a random number between 0 and 10
* Player has the toString() to return: "Player-number score: score"

## The PlayerDAO class

* PlayerDAO handles the read/write file operations
* PlayerDAO has a class method to write a list of players to file
* PlayerDAO has a class method to read a list of players from file
* PlayerDAO has a class method to clear the file content
  
## The Game class

* Game has 3 fields as follows:
  * a list of players
  * a file name "game.data"
  * a File object
* Game has a default constructor
* Game has the method 'setup' to check if the file "game.data" exist. If the file does not exist, the method should create "game.data" in the correct application directory
* Game has the method 'play' to start a new game with 10 players as follows:
  * the method should remember the last game player number and start from the next
  * the method should only show the current game
  * the current game index should be the correct game count based on the file record
* Game has the method 'save' to write a list of players to file
* Game has the method 'show' to show all games recorded in file
* Game has the method 'clear' to clear file content
* Game has the method 'menu' that represents the Game menu and provide users with 4 choices:
  * ( p ) – play a new game
  * ( s ) – save the game to file
  * ( v ) – view all game records
  * ( X ) – exit
  * default : help()
* Define a method called 'help' that prints out the menu options
* Define the main() method should execute the system menu()

**NOTE:** define the necessary read functions in Game
