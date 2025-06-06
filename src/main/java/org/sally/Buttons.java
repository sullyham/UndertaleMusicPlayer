package org.sally;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JButton implements ActionListener {
    public Buttons(){
        this.setBounds(275,200,75 ,75);
        this.addActionListener(this);
        this.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
        this.setText("\u23F8");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            System.out.println("WORKS");
        }
    }
}
