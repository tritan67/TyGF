
public class test extends Entity {

	
	int i;
	public test(double x, double y, String imageName) {
		super(x, y, imageName);
		
	}

	@Override
	void DoLogic(long Delta) {
		
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
