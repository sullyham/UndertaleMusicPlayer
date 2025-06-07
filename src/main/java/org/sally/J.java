package org.sally;

import javax.swing.*;
import java.awt.*;

public class J extends JPanel {
    public static JLabel label;
    public J(){
       label = new JLabel();
       label.setText("Now playing \"" + Main.q.peek().toString().replace(".wav","") + "\"");
       label.setFont(new Font("Determination Mono Web", Font.PLAIN, 30));
       label.setForeground(Color.white);
       this.setBounds(0,150,700,50);
       this.setBackground(Color.black);
       this.add(label);


    }

    public static void setLabel() {
        label.setText("Now playing \"" + Main.q.peek().toString().replace(".wav","") + "\"");
    }
}
