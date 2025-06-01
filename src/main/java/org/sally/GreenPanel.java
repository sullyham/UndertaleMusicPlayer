package org.sally;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GreenPanel extends JPanel{
    public GreenPanel(){
        this.setBackground(Color.green);
        this.setBounds(0,250,900    ,900);
        this.setLayout(new BorderLayout());
    }

}
