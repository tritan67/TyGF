package game.entities;

import gameEngine.Game;
import gameEngine.SoundPlayer;
import gameEngine.interfaces.Entity;


public class test extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6942025478225226437L;

	SoundPlayer sound = new SoundPlayer("airstrike_fire_01.wav");
	
	int i;
	public test(double x, double y, String imageName) {
		super(x, y, imageName);
		
		
	}

	@Override
	
	public void DoLogic(long Delta) {
		if(Game.iskeypress('p')){
		sound.play();	
		}
			
		
		
		if(Game.iskeypress('w')){
			
			this.addVel(0, -1);
		}
		if(Game.iskeypress('s')){
			
			this.addVel(0, 1);
		}
		if(Game.iskeypress('a')){
			
			this.addVel(-1, 0);
		}
		if(Game.iskeypress('d')){
			
			this.addVel(1, 0);
		}
		if(Game.getMouseClicks(0)){
			//System.out.println("there");
			try{
			this.addVel((Game.getMouseLoc().getX()-this.getX())/200,(Game.getMouseLoc().getY()-this.getY())/200);
		}
		catch(NullPointerException e){}	
		}
		if(Game.getMouseClicks(2)){
			//System.out.println("there");
			this.addVel((Game.getMouseLoc().getX()-this.getX())/-200,(Game.getMouseLoc().getY()-this.getY())/-200);
		}
		doMovement(Delta);
		//System.out.println("hello");

	}

}
