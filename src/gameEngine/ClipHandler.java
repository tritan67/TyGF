package gameEngine;
import javax.sound.sampled.*;
public class ClipHandler implements Runnable , LineListener {

	Clip clip;
	//boolean clipDone;
	public ClipHandler(Clip clip){
		this.clip = clip;
		clip.addLineListener(this);
		
	}
	
	@Override
	public void run() {
		clip.start();
		
		
			
		
		
		
		
	}

	@Override
	public void update(LineEvent lineEvent) {
		 if(lineEvent.getType()==LineEvent.Type.STOP){
			 clip.close();
			 clip.removeLineListener(this);
			 //clip=null;
			 //this.clip=null;
		 }
		 
		
		
		
		
	}

	
	
	
}
