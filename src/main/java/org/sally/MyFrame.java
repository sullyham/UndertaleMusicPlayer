package org.sally;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    Pause button = new Pause();
    Play button2 = new Play();
    J text = new J();
    public MyFrame() {
        button.setPlay(button2);
        button2.setPause(button);

        ImageIcon image = new ImageIcon("heart.png");
        ImageIcon ad = new ImageIcon("ad.png");
        JLabel asr = new JLabel();
        asr.setIcon(ad);
        this.add(asr);
        asr.setBounds(500,200,150,250);

        button2.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exits program on close
        this.setIconImage(image.getImage()); //sets program icon
        this.getContentPane().setBackground(new Color(134, 115, 181)); //background of frame
        this.setResizable(false);
        this.setTitle("UNDERTALE");
       this.setLayout(null); //choose layout mngrs
        this.setVisible(true);
        this.setSize(660   , 520); //resolution
        this.add(text);
        this.add(button);
        this.add(button2);
       //this.pack(); //automatically sets window size to accommodate elements




    }
}
