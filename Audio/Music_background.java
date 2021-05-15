package Audio;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

import View.South;

public class Music_background {
	private Clip clip;
	private AudioInputStream audio;
	private File file;
	private long Frame;
	private int dem=0;
	public Music_background(String Filein) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
	{
		file=new File(Filein);
		audio= AudioSystem.getAudioInputStream(file);
		clip=AudioSystem.getClip();
		clip.open(audio);
		
	}
	public void Start()
	{
		if(dem==0)
		{
			clip.start();
			dem++;
		}
		else {
			clip.loop(1);
		}
		
	}
	public void Pause() throws IOException
	{
		Frame=clip.getMicrosecondPosition();
		clip.stop();
	}
	public void Remuse() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		clip.close();
		audio= AudioSystem.getAudioInputStream(file);
		clip=AudioSystem.getClip();
		clip.open(audio);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		clip.setMicrosecondPosition(Frame);
		Start();
	}
	public void Stop()
	{
		Frame=0L;
		clip.stop();
		clip.close();
	}
	public void Reset()
	{
		clip.setMicrosecondPosition(0);
		Start();
	}
	public void Loop()
	{
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
}
