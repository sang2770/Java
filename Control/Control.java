package Control;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import View.Game_Main;

public class Control {
	public static void main(String[] args) {
		try {
			Game_Main a=new Game_Main();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}
		
	}
}
