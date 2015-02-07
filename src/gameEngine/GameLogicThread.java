package gameEngine;

import game.levels.TestLevel;
import gameEngine.interfaces.Entity;
import gameEngine.interfaces.Level;

public class GameLogicThread implements Runnable {
	volatile long  last;
	private volatile static Level currentLevel = new TestLevel();
	
	
	@Override
	
	
	public void run() {
		//int first=0;
		System.out.println("imrunning");
		
		while (true){
			try{Thread.sleep(5);} catch(Exception e){}
			
			
			
			//System.out.println("imrunning");
			
				
				for(Entity E : currentLevel.getLevelEntities()){
					E.DoLogic();
					
				}
				
			
			for(Entity E : Level.getGameEntities()){
				
				E.DoLogic();
				
				
				 //saves current time for next calculation.
				
			}
			
			//try{Thread.sleep(1);} catch(Exception e){}
		}
		
		

	}

	
	
	
	
	
	
}

