package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel(){
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        ImageIcon image2 = new ImageIcon("cursed.jpeg");
        this.setText("Bros using github");
        this.setHorizontalTextPosition(this.CENTER);
        this.setVerticalTextPosition(this.TOP);
        this.setIconTextGap(-75);
        this.setForeground(Color.red);
        this.setFont(new Font("Another Danger - Demo", Font.PLAIN,60));
        this.setIcon(image2);
        this.setBackground(Color.white);
        this.setOpaque(true);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBounds(100,100,800,800);
    }

}
