package gameEngine;
import java.io.*;

//import javax.sound.*;
import javax.sound.sampled.*;
public class SoundPlayer {
	
	
	private String soundFile;
	//private File audioFile;
	//private AudioInputStream audioStream;
	//private AudioFormat aduidoFormat;
	private Clip sound;
		
	public SoundPlayer(String SoundFile){
		
		this.soundFile=SoundFile;
			
	}
	// need to implement audio loading and playing.
	
	public void loadAudio(){
		
		try {
			File audioFile= new File(soundFile);
			AudioInputStream audioStream =  AudioSystem.getAudioInputStream(audioFile);
			AudioFormat audioFormat = audioStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class,audioFormat);
			
			sound = (Clip) AudioSystem.getLine(info);
			
			sound.open(audioStream);
			
			audioStream.close();
			
			
		} catch (UnsupportedAudioFileException e) {
			System.out.println("Unsupported File Type.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Can not find File.");
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	public void unloadAudio(){
		
		sound.close();
		
	
	}
	
	public void play(){
		loadAudio(); // have this here to play more then once.
		new Thread(new ClipHandler(sound)).start();
		
	
	}
	
	public void stop(){
	sound.stop();	
		
	
	}
	

}
