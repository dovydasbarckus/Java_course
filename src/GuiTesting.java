import javax.swing.*;
import java.awt.*;

public class GuiTesting {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setTitle("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(0, 166, 255));
    }
}
