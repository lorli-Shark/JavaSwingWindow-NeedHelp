import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine(0, 0, 400, 400);
    }
}
