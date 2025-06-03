package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.desktop.SystemEventListener;

public class MyFrame extends JFrame {
    public MyFrame() {
        MyPanel redpanel = new MyPanel();
        MyPanel2 bluepanel = new MyPanel2();
        ImageIcon image = new ImageIcon("gameimage.png");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exits program on close
        this.setIconImage(image.getImage()); //sets program icon
        this.getContentPane().setBackground(new Color(255, 255, 255)); //background of frame
        this.setResizable(false);
        this.setTitle("GUI");
       this.setLayout(null); //choose layout mngrs
        this.setVisible(true);
        this.setSize(1280   , 720); //resolution
        this.add(redpanel);
        this.add(bluepanel);
       //this.pack(); //automatically sets window size to accommodate elements




    }
}
