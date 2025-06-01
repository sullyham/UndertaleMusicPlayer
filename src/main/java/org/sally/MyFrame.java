package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        ImageIcon image = new ImageIcon("gameimage.png");

       MyLabel label = new MyLabel();
       OrangePanel panel = new OrangePanel();
       BluePanel bluePanel = new BluePanel();
       GreenPanel greenPanel = new GreenPanel();

       // this.add(label);
        this.add(panel);
        this.add(bluePanel);
        this.add(greenPanel);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setResizable(true);
        this.setTitle("GUI");
       this.setLayout(null);
        this.setVisible(true);
        this.setSize(1280   , 720);
       // this.pack(); //automatically sets window size to accommodate elements




    }
}
