package org.sally;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Backwards extends JButton implements ActionListener {
    public Backwards(){
        this.setBounds(150,250,75 ,75);
        this.addActionListener(this);
        this.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
        this.setText("⏪");
        this.setBorder(new LineBorder(Color.PINK,3));
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
