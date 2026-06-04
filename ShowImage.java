import javax.swing.*;

public class ShowImage {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Viewer");

        ImageIcon icon = new ImageIcon("modi.jpg");

        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}