
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
private static char lastchar=0;
//private static long lastRun=0;
//private static long Time = 50;

	@Override
	public void keyPressed(KeyEvent e) {
		char c= e.getKeyChar();
		
		if(lastchar==c){
			//lastRun=System.currentTimeMillis();
			return;
		}
		lastchar=c;
		for(int i=0;i<Game.getKeyNumber();i++){
			if(c==Game.getKeylist(i)){
				Game.setKeypress(true, i);
				//System.out.println("keyPressed: "+c);
				//try{Thread.sleep(10);} catch(Exception t){}
			}
			
			
			
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char c= e.getKeyChar();
		if(c==lastchar){
			lastchar=0;
			
		}
		
		for(int i=0;i<Game.getKeyNumber();i++){
			if(c==Game.getKeylist(i)){
				Game.setKeypress(false, i);
				
			}
			
			
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
