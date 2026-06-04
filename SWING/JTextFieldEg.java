package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextFieldEg extends JFrame{
    JTextField txt1;
    public JTextFieldEg(){
        Container c=this.getContentPane();
        txt1=new JTextField(10);
        c.setLayout(new FlowLayout());
        c.add(txt1);
    }
    public static void main(String[] args) {
        JTextFieldEg f=new JTextFieldEg();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}