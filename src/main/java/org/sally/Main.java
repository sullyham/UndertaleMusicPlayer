package org.sally;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Deque<String> q = new LinkedList<>();
    public static void main(String[] args) {
        q.add("Hopes and Dreams.wav");
        q.add("Inspire.wav");
        q.add("Asgore.wav");
        q.add("Heartache.wav");
        q.add("MEGALOVANIA.wav");
        q.add("Power of NEO.wav");


       new MyFrame();
       Music.PlayMusic(q.peek().toString());


    }
}