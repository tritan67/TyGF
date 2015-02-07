package gameEngine;

import game.entities.test;
import game.renderLayers.RenderLayerList;
import gameEngine.interfaces.Entity;
import gameEngine.interfaces.Level;


import java.awt.Canvas;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;



public class Game {
	
	private static Thread Graphics;
	private static Thread logic;
	
private volatile static Point mouseLoc=new Point(0,0);

private volatile static char[] keylist = {'a','d','s','w',' ','p'};
private volatile static boolean[] keypress=new boolean[keylist.length];
private volatile static boolean[] mouseClicks= new boolean[3];
private volatile static Level StartLevel; 




private static volatile boolean Unpuased=true;
	static GameGraphics gg;
	static GameLogicThread lt;
	public static void main(String[] args) {
		lt = new GameLogicThread();
		 gg = new GameGraphics();
		 Graphics = new Thread((Runnable)gg);
		 logic = new Thread(lt);
		
		logic.start();
		Graphics.start();
		
		RenderLayerList.AddLayers();
		
		//entities.add(new test(0,0,"bullet.png"));
	}

	public static Canvas getGraphics() {
		return gg;
	}

	//public static List<Entity> getEntities() {
		//return entities;
	//}

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
