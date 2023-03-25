# Soccer Guessing Game
<h2 style = "font-size : 18px"Description</h2>
<ul><li>Soccer Guessing Game is a simple guessing game where the user needs to guess the name of a famous soccer player by looking at their image. The game has two parts: a password prompt and the actual game.
</li>
</ul>


Game
Once the user enters the correct password, the game starts. The user is presented with an image of a soccer player, and they need to guess the name of the player by typing their name into a text field. If the user types the correct name, a message is displayed congratulating them, and the game ends. If the user types the wrong name, an error message is displayed, and they can try again. The user can also click the "Cancel" button to exit the game at any time.

Code Overview
The code is written in Java and uses the Swing library for the user interface. The code is divided into two parts: Password.java and GameFrame.java.

Password.java contains the code for the password prompt. It creates a new JFrame with a JPasswordField and an ActionListener that checks if the entered password is correct. If the password is correct, it launches a new instance of GameFrame.java.

GameFrame.java contains the code for the actual game. It creates a new JFrame with an image of a soccer player, a text field for the user to enter their guess, and two buttons: "OK" and "Cancel". It also has an ActionListener that checks if the entered guess is correct. If the guess is correct, it displays a congratulatory message and exits the game. If the guess is incorrect, it displays an error message and allows the user to try again.

Running the Code
To run the code, you will need to have Java installed on your system. You can download the latest version of Java from the official website.

Once you have Java installed, you can compile and run the code using a Java IDE such as Eclipse or NetBeans. Simply open the project in your IDE, compile the code, and run the Code6_1001844964.java file.

Alternatively, you can compile and run the code from the command line using the following commands:

ruby

$ javac *.java
$ java Code6_1001844964
Conclusion
Soccer Guessing Game is a simple yet fun game that demonstrates the use of Java and the Swing library for creating graphical user interfaces. The code can be easily modified and extended to include additional features and functionality.
