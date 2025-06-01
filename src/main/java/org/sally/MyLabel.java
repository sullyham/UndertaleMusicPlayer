package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel(){
        Border border = BorderFactory.createLineBorder(Color.white, 3); // adds a border to label
        ImageIcon image2 = new ImageIcon("OIP.jpg");
        ImageIcon tiny = new ImageIcon("tiny.png");
        this.setText("We're watching you.");
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.RIGHT);
        this.setIconTextGap(-10); //space between image and text
        this.setBorder(border); //make sure to add the border!
        this.setForeground(Color.red); //Sets text color
        this.setFont(new Font("Another Danger - Demo", Font.PLAIN,30));
        this.setIcon(tiny); //sets icon for program
        this.setBackground(Color.black); //sets border color
        //this.setOpaque(true); makes thing fill whole window!
       // this.setBounds(350,250,64 ,64); //not needed if you use frame.pack() automatically does
    }

}
