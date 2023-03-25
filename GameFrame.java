/*
 * Aryan Mainkar 1001844964
 */
package code6_1001844964;

/**
 *
 * @author Aryan
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class GameFrame extends JFrame
{
    private final JLabel label1;
    private final JButton OKButton;
    private final JButton CancelButton;
    private final JTextField textField1;
    private String CCName;
    private String GetValue;
    private String ShowUser = "";
    int int_random = 0;
    int upperbound = 0;
    Icon CC;
    
    public GameFrame()
    {       
        super("Welcome to the Soccer Guessing Game");
        setLayout(new FlowLayout());
        Random rand = new Random(); 
        upperbound = 4;
        int_random = rand.nextInt(upperbound); 
        
        switch(int_random)
        {       
            case 0:
                CCName = "Messi";
                CC = new ImageIcon(getClass().getResource(CCName + ".png"));
                break;
            case 1:
                CCName = "Neymar";
                CC = new ImageIcon(getClass().getResource(CCName + ".png"));
                break;
            case 2:
                CCName = "Pele";
                CC = new ImageIcon(getClass().getResource(CCName + ".png"));
                break;
            case 3:
                CCName = "Ronaldo";
                CC = new ImageIcon(getClass().getResource(CCName + ".png"));
                break;             
        }
          
        label1 = new JLabel();
        label1.setText("Who is this soccer player??");
        label1.setIcon(CC);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);    
        label1.setSize(100,100);
        label1.setToolTipText("Hint");
        add(label1);        
        
        textField1 = new JTextField(10);
        textField1.setText("Type Here");
        textField1.selectAll();
        add(textField1);
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        
        OKButton = new JButton("OK");
        OKButton.addActionListener(handler);
        add(OKButton);
        
        CancelButton = new JButton("Cancel");
        CancelButton.addActionListener(handler);
        add(CancelButton);
        
    }
    
    private class TextFieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {  
            boolean Guess = false;
            GetValue = textField1.getText();
            GetValue = GetValue.toLowerCase();
            CCName = CCName.toLowerCase();
                     
            if(GetValue.equals(CCName)) 
            {          
                ShowUser = "You guessed correctly!!";
                Guess = true;
            }
            else
            {
                ShowUser = "This is not correct. Please try again";
            }
          
            if(event.getSource() == textField1 || event.getSource() == OKButton)
            {
                JOptionPane.showMessageDialog(null,ShowUser);
                if(Guess == true)
                {
                    System.exit(0);
                }                     
            }
            else if(event.getSource() == CancelButton)
            {
                System.exit(0);
            }                
        }
    }    
}
