package gameEngine.interfaces;
import gameEngine.Game;
import java.awt.Canvas;
import java.awt.Graphics2D;
public abstract class RenderLayer {
	
	
	boolean isRendering=true;
	
	protected Graphics2D draw;
	protected Canvas screen = Game.getGraphics();
	
	
	
	public RenderLayer(){
		//this.draw=draw;
	}
	
	public Graphics2D getGraphics(){
		return draw;
	}
	
	public abstract void renderThisLayer();
	
	
	
	public void setIsRendering(boolean render){
		 this.isRendering=render;
		 
		 
	 }
	
	public boolean isRendering(){
		
		
		return isRendering;
	}
	
	public void setDraw(Graphics2D d){
		
		draw = d;
		
	}
	
	
}

 
