package SWING;
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

class LoginFrame extends JFrame implements ActionListener{

    JLabel userlbl, passlbl;
    JTextField usertxt, passtxt;
    JButton clrbtn, loginbtm;
    LoginFrame()
    {
        userlbl = new JLabel("enter user name:");
        passlbl = new JLabel(" enter a password:");
        usertxt = new JTextField(10);
        passtxt = new JTextField(10);
        clrbtn = new JButton("Clear");
        loginbtm = new JButton("Login"); 
        Container c = this.getContentPane();
        c.setLayout(new GridLayout(3, 2));
        c.add(userlbl); c.add(usertxt);
        c.add(passlbl); c.add(passtxt);
        c.add(clrbtn); c.add(loginbtm);
    }

}
public class JButtonEg {
    public static void main(String[] args) {

        LoginFrame f = new LoginFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(400, 300);
        f.setSize(300, 200);
        f.setVisible(true);
        
    }
    
}
