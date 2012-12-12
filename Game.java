import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Game {
private volatile static Point mouseLoc=new Point(0,0);
private volatile static List<Entity> entities=new ArrayList<Entity>();
private static char[] keylist = {'a','d','s','w',' ','p'};
private volatile static boolean[] keypress=new boolean[keylist.length];
private volatile static boolean[] mouseClicks= new boolean[3];

private static volatile boolean Unpuased=true;
//private static URL resources;

	public static void main(String[] args) {
		Thread Graphics = new Thread(new GameGraphics());
		Thread logic = new Thread(new GameLogicThread());
		//resources =Game.class.getClassLoader().getResource("src/images/");
		
		//Graphics.setPriority(6);
		//logic.setPriority(10);
		logic.start();
		//System.out.println(logic.isAlive());
		Graphics.start();
		entities.add(new test(0,0,"bullet.png"));
		//entities.add(new test(50,50,"src/images/bullet.png"));
		//entities.add(new test(50,50,"src/images/bullet.png"));
	}

	public static List<Entity> getEntities() {
		return entities;
	}

	public static boolean unpuased() {
		return Unpuased;
	}
	
	public static void puaseUnpuase(){
		
		Unpuased=!(Unpuased);
	}

	public static boolean getKeypress(int i) {
		return keypress[i];
	}

	public static void setKeypress(boolean key,int i) {
		Game.keypress[i] = key;
	}

	public static char getKeylist(int i) {
		return keylist[i];
	}

	public static void setKeylist(char c ,int i) {
		Game.keylist[i] = c;
	}

	public static int getKeyNumber() {
		
		return Game.keylist.length;
	}
	
	public static boolean iskeypress(char c){
		for(int i =0;i<Game.keylist.length;i++){
			if(c==Game.keylist[i]){
			return Game.keypress[i];
			}
		}
		
		return false;
	}

	public static boolean getMouseClicks(int i) {
		return mouseClicks[i];
	}

	public static void setMouseClicks(boolean mouseClick,int i) {
		Game.mouseClicks[i] = mouseClick;
	}

	public static Point getMouseLoc() {
		return mouseLoc;
	}

	public static void setMouseLoc(Point mouseLoc) {
		Game.mouseLoc = mouseLoc;
	}

}
