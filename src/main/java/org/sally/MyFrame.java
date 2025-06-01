package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.desktop.SystemEventListener;

public class MyFrame extends JFrame {
    public MyFrame() {
        ImageIcon image = new ImageIcon("gameimage.png");




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
