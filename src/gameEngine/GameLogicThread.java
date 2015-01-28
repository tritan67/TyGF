package gameEngine;

public class GameLogicThread implements Runnable {
	volatile long  last;
	
	
	@Override
	
	
	public void run() {
		int x;
		//int first=0;
		System.out.println("imrunning");
		
		while (true){
			try{Thread.sleep(5);} catch(Exception e){}
			
			
			x=Game.getEntities().size();
			
			//System.out.println("imrunning");
			
			
			for(int i =0;i<x;i++){
				
				Game.getEntities().get(i).DoLogic(Math.abs(last-System.nanoTime()));
				last = System.nanoTime(); //saves current time for next calculation.
				
			}
			
			//try{Thread.sleep(1);} catch(Exception e){}
		}
		
		

	}
public void doCollision(){
	
	for(int i=0;i<Game.getEntities().size();i++){
		
		
		
	}
	
	
	
	
	
	
}
}
