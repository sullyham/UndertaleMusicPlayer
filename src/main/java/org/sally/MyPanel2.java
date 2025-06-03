package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyPanel2 extends JPanel {
    public MyPanel2(){
        Border border = new LineBorder(Color.cyan,3);

        this.setBackground(Color.blue);
        this.setBounds(0,360,1280,360);
        JLabel label = new JLabel();
        label.setText("Be Strong");
        label.setFont(new Font("Determination Mono Web", Font.PLAIN, 100));
        label.setOpaque(true);
        label.setBorder(border);
        this.add(label);

    }
}
