/*
 * Aryan Mainkar 1001844964
 */
package code6_1001844964;
/**
 *
 * @author Aryan
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Password extends JFrame
{    
    private final JPasswordField passwordField ; 
    private String UserInput = "";
    private final String PWD = "abcde";  
    
    public Password()
    {
        super("Enter the password to continue");
        setLayout(new FlowLayout());
        TextFieldHandler handler = new TextFieldHandler(); 
        passwordField = new JPasswordField(10);
        passwordField.setEchoChar('X');
        add(passwordField);
        passwordField.addActionListener(handler);  
    }
        
    private class TextFieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {          
            if (event.getSource() == passwordField)
            {   
                UserInput = event.getActionCommand();                
            }  
            
            if(UserInput.equals(PWD))
            {
                setVisible(false);
                GameFrame gameframe = new GameFrame();
                gameframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameframe.setSize(1280,720);
                gameframe.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid password...please try again");    
            }                    
        }
    }
            
}













