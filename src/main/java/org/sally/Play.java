package org.sally;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Play  extends JButton implements ActionListener {
    Pause pause;
    public Play(){
        this.setBounds(275,250,75 ,75);
        this.addActionListener(this);
        this.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
        this.setText("▶");
        this.setBorder(new LineBorder(Color.PINK,3));
    }
    public void setPause(Pause pause){
        this.pause = pause;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            this.setVisible(false);
            Music.PlayMusic(Main.q.peek().toString());
            pause.setVisible(true);
        }
    }
}
