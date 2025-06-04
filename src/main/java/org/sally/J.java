package org.sally;

import javax.swing.*;
import java.awt.*;

public class J extends JPanel {
    public J(){
        JLabel label = new JLabel();
        label.setText("Ruins-Entrance");
        label.setFont(new Font("Determination Mono Web", Font.PLAIN, 20));
        label.setForeground(Color.white);
        label.setBounds(200,200,140,120);

        JLabel sa = new JLabel();
        sa.setText("Sully");
        sa.setFont(new Font("Determination Mono Web", Font.PLAIN, 20));
        sa.setForeground(Color.white);
        sa.setBounds(0,0,140,120);
        this.add(label);
        this.setBounds(100,100,160,120);
        this.add(sa);
        this.setBackground(Color.black);


    }
}
