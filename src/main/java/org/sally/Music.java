package org.sally;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {
    static AudioInputStream audioinput;
    static Clip clip;
    public static void PlayMusic(String location){
        try{
            File musicPath = new File(location);
            if(musicPath.exists()){
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
