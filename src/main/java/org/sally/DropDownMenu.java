package org.sally;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DropDownMenu extends JComboBox {
    public DropDownMenu(){
        super(new String[]{"Menu","About", "Help"});
        this.setSelectedIndex(0);
        this.addActionListener(this);
        this.setBounds(0,0,100,20);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("FUCK!");
    }


}
