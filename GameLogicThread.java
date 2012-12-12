
public class GameLogicThread implements Runnable {

	@Override
	public void run() {
		int x;
		//int first=0;
		System.out.println("imrunning");
		long last;
		while (true){
			//try{Thread.sleep(1);} catch(Exception e){}
			
			
			x=Game.getEntities().size();
			
			//System.out.println("imrunning");
			
			
			for(int i =0;i<x;i++){
				last = System.nanoTime();
				Game.getEntities().get(i).DoLogic(Math.abs(last-System.nanoTime()));
				
				
			}
			
			//try{Thread.sleep(1);} catch(Exception e){}
		}
		
		

	}
public void doSphereCollision(){
	
	for(int i=0;i<Game.getEntities().size();i++){
		
		
		
	}
	
	
	
	
	
	
}
}
