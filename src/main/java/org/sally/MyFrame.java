package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.desktop.SystemEventListener;

public class MyFrame extends JFrame {
    public MyFrame() {
        ImageIcon image = new ImageIcon("heart.png");
        J text = new J();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exits program on close
        this.setIconImage(image.getImage()); //sets program icon
        this.getContentPane().setBackground(new Color(0, 0, 0)); //background of frame
        this.setResizable(false);
        this.setTitle("UNDERTALE");
       this.setLayout(null); //choose layout mngrs
        this.setVisible(true);
        this.setSize(660   , 520); //resolution
        this.add(text);
       //this.pack(); //automatically sets window size to accommodate elements




    }
}
