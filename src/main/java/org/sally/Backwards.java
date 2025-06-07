package org.sally;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Backwards extends JButton implements ActionListener {
    public Backwards(){
        this.setBounds(150,250,75 ,75);
        this.addActionListener(this);
        this.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
        this.setText("⏪");
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
