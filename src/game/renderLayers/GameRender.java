package game.renderLayers;
import java.awt.Color;
import java.awt.Image;

//import gameEngine.Game;
import gameEngine.interfaces.Entity;
import gameEngine.interfaces.Level;
import gameEngine.interfaces.RenderLayer;
public class GameRender extends RenderLayer  {

	public GameRender() {
		super();
	}

	@Override
	public void renderThisLayer() {
		
		
		Image entImage;
		int x;
		int y;
		
		draw.setColor(new Color(255,255,255));
		for(Entity E : Level.getGameEntities()){
			x=(int) E.getX(); //get the float values and covert them to int for rendering.
			y=(int) E.getY();
			entImage=E.getMyImage(); // load image.
			
			draw.drawImage(entImage,x,y,screen);
	}
		
	}

	
	
	
	
}
