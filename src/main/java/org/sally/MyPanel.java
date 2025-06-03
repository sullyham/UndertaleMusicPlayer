package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(){
        this.setBackground(Color.red);
        this.setBounds(0,0,1280,360);
        JLabel label = new JLabel();
        label.setText("Be Rich");
        label.setFont(new Font("Times New Roman", Font.PLAIN, 100));
        label.setOpaque(true);
        this.add(label);
    }
}
