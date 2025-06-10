package org.sally;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Backwards extends JButton implements ActionListener {
    public Backwards(){
        this.setBounds(150,250,75 ,75);
        this.addActionListener(this);
        this.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
        this.setText("⏪");
        this.setBorder(new LineBorder(Color.PINK,3));
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        //Basically we need to get the last item in the queue
        // Get last item
        //Put it in front while deleting it from the back
        //Then play whatever is in the front

        String curr = Main.q.getLast(); // gets last element
        Main.q.remove(curr); //deletes it from the back
        Main.q.addFirst(curr); //adds it to the front
        Music.PauseMusic();
        Music.PlayMusic(Main.q.getFirst());
        J.setLabel();
    }
}
