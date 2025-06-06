package org.sally;

import javax.swing.*;
import java.awt.*;

public class J extends JPanel {
    public J(){
       JLabel label = new JLabel();
       label.setText("Now playing \"" + Main.filepath.replace(".wav","") + "\"");
       label.setFont(new Font("Determination Mono Web", Font.PLAIN, 30));
       label.setForeground(Color.white);
       this.setBounds(125,150,400,50);
       this.setBackground(Color.black);
       this.add(label);


    }
}
