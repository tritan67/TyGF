package gameEngine;
import java.awt.Canvas;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
//import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGraphics extends Canvas implements Runnable {
	
	/**
	 * 
	 */
	
	
	long time=System.currentTimeMillis();
	
	
	private static final long serialVersionUID = 5510581710345277592L;
	private BufferStrategy strategy;
	private Graphics2D g2;
	//private Point mouseLoc;
	private double FPS;
	
	
	
	@Override
	public void run() {
		
		
	JFrame window = new JFrame("This Game Frame");
	JPanel panel = (JPanel) window.getContentPane();
	panel.setPreferredSize(new Dimension(800,600));
	panel.setLayout(null);
	setBounds(0,0,800,600);
	panel.add(this);
	setIgnoreRepaint(true);
	window.pack();
	window.setResizable(false);
	window.setVisible(true);
	panel.setDoubleBuffered(false);
	
	window.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
	
	window.addKeyListener(new KeyInput());
	this.addMouseListener(new MouseInput());
	
	createBufferStrategy(2);
	strategy = getBufferStrategy();
	
	long last = 0;
	
	Image entImage;
	int x;
	int y;
	
	while(true){
		Game.setMouseLoc(this.getMousePosition());
		window.requestFocus();
		g2=(Graphics2D) strategy.getDrawGraphics();
		g2.setColor(Color.BLACK);
		g2.fillRect(0,0, 800, 600);
		
		
		
		
		g2.setColor(new Color(255,255,255));
		g2.drawString("its working:"+FPS, 5, 15);
		for(int i1 =0;i1<Game.getEntities().size();i1++){
			x=(int) Game.getEntities().get(i1).getX(); //get the float valus and covert them to int for rendering.
			y=(int) Game.getEntities().get(i1).getY();
			entImage=Game.getEntities().get(i1).getMyImage(); // load image.
			
			g2.drawImage(entImage,x,y,this);
	}
		g2.dispose();
		
		strategy.show();
		
		
		
		FPS = (1000000.0/( System.nanoTime()-last));
		last = System.nanoTime();
		//last=time;
		
	
		
		
		
		
	}
		
	}
	
	public void doEntityGraphicsUpdate(){

		
	}

	public Graphics2D getG2() {
		return g2;
	}
	
	


}
