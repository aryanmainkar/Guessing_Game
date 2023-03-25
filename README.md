# Soccer Guessing Game

# MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.





<h2 style="font-size: 18px;">Soccer Guessing Game</h2>
<ul>
  <li>Soccer Guessing Game is a simple guessing game where the user needs to guess the name of a famous soccer player by looking at their image. The game has two parts: a password prompt and the actual game.
  </li>
</ul>

<h2 style ="font-size:18px;">Password Prompt</h2>
<ul>
  <li>
    When the game is started, the user is prompted to enter a password to continue. If the user enters the correct password, they are allowed to play the game. Otherwise, an error message is displayed, and the user is asked to try again.  
   </li>
</ul>

<h2 style = "font-size:18px;">Game</h2>
<ul>
  <li>
Once the user enters the correct password, the game starts. The user is presented with an image of a soccer player, and they need to guess the name of the player by typing their name into a text field. If the user types the correct name, a message is displayed congratulating them, and the game ends. If the user types the wrong name, an error message is displayed, and they can try again. The user can also click the "Cancel" button to exit the game at any time.
    </li>
</ul>

<h2 style = "font-size : 18px;">Code Overview</h2>
<ul>
  <li>
The code is written in Java and uses the Swing library for the user interface. The code is divided into two parts: Password.java and GameFrame.java.
  </li>
  <li>
Password.java contains the code for the password prompt. It creates a new JFrame with a JPasswordField and an ActionListener that checks if the entered password is correct. If the password is correct, it launches a new instance of GameFrame.java.
   </li>
  <li>
GameFrame.java contains the code for the actual game. It creates a new JFrame with an image of a soccer player, a text field for the user to enter their guess, and two buttons: "OK" and "Cancel". It also has an ActionListener that checks if the entered guess is correct. If the guess is correct, it displays a congratulatory message and exits the game. If the guess is incorrect, it displays an error message and allows the user to try again.
    </li>
<ul>

<h2 style = "font-size : 18px;">Running the Code</h2>
 <ul>
    <li>
To run the code, you will need to have Java installed on your system. You can download the latest version of Java from the official website.
    </li>
    
   <li>
Once you have Java installed, you can compile and run the code using a Java IDE such as Eclipse or NetBeans. Simply open the project in your IDE, compile the code, and run the Code6_1001844964.java file.
      </li>
   <li>
Alternatively, you can compile and run the code from the command line using the following commands:
   </li>

Ruby : 

$ javac *.java
$ java Code6_1001844964
    
 <h2 style = "font-size : 18px;">Conclusion</h2>
<ul>
  <li>
Soccer Guessing Game is a simple yet fun game that demonstrates the use of Java and the Swing library for creating graphical user interfaces. The code can be easily modified and extended to include additional features and functionality.
    </li>
  </ul>
