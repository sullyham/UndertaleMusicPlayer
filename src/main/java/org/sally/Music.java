package org.sally;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Music {
    static AudioInputStream audioinput;
    static Clip clip;
    public static void PlayMusic(String location){
        try{
            File musicPath = new File(location);
            if(musicPath.exists()){
                System.out.println("NOW PLAYING " + location);
                System.out.println("queue order is "+ Main.q.toString());
                audioinput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioinput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else{
                System.out.println("No such file!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void PauseMusic(){
        clip.stop();
    }
}
