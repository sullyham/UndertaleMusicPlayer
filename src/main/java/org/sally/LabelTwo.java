package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelTwo extends JLabel {
    public LabelTwo() {
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        this.setBounds(20,40,1000,60);
        this.setText("LABELTWO");
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
    }


}
