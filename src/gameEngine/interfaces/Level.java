package gameEngine.interfaces;

import java.util.ArrayList;
import java.util.List;




public class Level {
	
	protected volatile List<Entity> levelEntities = new ArrayList<Entity>();
	private volatile static List<Entity> GameEntities = new ArrayList<Entity>();
	
	
	public Level(){
		onLevelstart();
		
		
	}
	
	
	public static List<Entity> getGameEntities() {
		return GameEntities;
	}
	
	
	
	public void addLevelEntity(Entity E){
		onEntitySpawn(E);
		getGameEntities().add(E);
		
		
	}
	
	public List<Entity> getLevelEntities() {
		return levelEntities;
	}
	
	
	
	public void addGameEntity(Entity E){
		onEntitySpawn(E);
		getGameEntities().add(E);
		
		
	}
	
	public void onEntityDeath(Entity E){
		return;
			
	}
	
	
	public void onEntitySpawn(Entity E){
		return;
		
		
	}
	
	
	public void onLevelComplete(Level L){
		return;
		
	}
	
	public void onLevelTransfere(Level L){
		return;
		
	}
	
	
	public void onLevelstart(){
		return;
		
	}
	
	

}
