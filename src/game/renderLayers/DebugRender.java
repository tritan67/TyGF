package game.renderLayers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import gameEngine.interfaces.RenderLayer;

public class DebugRender extends RenderLayer implements ActionListener {
	
	private int fps = 0;
	
	private int frameCount =0;
	
	public DebugRender(){
		
		Timer T = new Timer(1000,this);
		T.start();
		
	}

	@Override
	public void renderThisLayer() {
		
		this.frameCount++;
		draw.drawString("FPS: "+fps, 20, 20);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		fps=frameCount;
		frameCount=0;
		
	}
	
	
	
	
	

}
