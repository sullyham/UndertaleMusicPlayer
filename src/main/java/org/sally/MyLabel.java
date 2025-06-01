package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel(){
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        ImageIcon image2 = new ImageIcon("OIP.jpg");
        this.setText("I'm accessing this shit on linux!");
        this.setHorizontalTextPosition(this.CENTER);
        this.setVerticalTextPosition(this.TOP);
        this.setIconTextGap(-75);
        this.setForeground(Color.red); //Sets text color
        this.setFont(new Font("Another Danger - Demo", Font.PLAIN,30));
        this.setIcon(image2);
        this.setBackground(Color.orange); //sets border color
        this.setOpaque(true);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBounds(0,0,500 ,500);
    }

}
