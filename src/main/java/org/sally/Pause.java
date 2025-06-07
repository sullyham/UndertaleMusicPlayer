package org.sally;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pause extends JButton implements ActionListener {
    Play play;
    public Pause(){
        this.setBounds(275,250,75 ,75);
        this.addActionListener(this);
        this.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
        this.setText("⏸");
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
           this.setVisible(false);
           Music.PauseMusic();
           play.setVisible(true);
        }
    }
}
