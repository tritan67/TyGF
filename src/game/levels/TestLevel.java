package game.levels;

import game.entities.test;
import gameEngine.interfaces.Level;

public class TestLevel extends Level {

	
	 public TestLevel(){
		 super();
		 this.addGameEntity(new test(0,0,"bullet.png"));
		 
	 }
	 
	 
	
}
