package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel(){
        Border border = BorderFactory.createLineBorder(Color.yellow, 3); // adds a border to label
        ImageIcon image2 = new ImageIcon("OIP.jpg");
        this.setText("I'm accessing this shit on linux!");
        this.setHorizontalTextPosition(this.CENTER);
        this.setVerticalTextPosition(this.TOP);
        this.setIconTextGap(-75); //space between image and text
        this.setBorder(border); //make sure to add the border!
        this.setForeground(Color.red); //Sets text color
        this.setFont(new Font("Another Danger - Demo", Font.PLAIN,50));
        this.setIcon(image2); //sets icon for program
        this.setBackground(Color.black); //sets border color
        this.setOpaque(true);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
       // this.setBounds(350,150,500 ,500); not needed if you use frame.pack() automatically does
    }

}
