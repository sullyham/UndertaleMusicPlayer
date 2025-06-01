package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        ImageIcon image = new ImageIcon("gameimage.png");

       MyLabel label = new MyLabel();
       LabelTwo labelTwo = new LabelTwo();

        this.add(label);
        this.add(labelTwo);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setResizable(true);
        this.setTitle("GUI");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1220   , 1220);




    }
}
