package gameEngine;
import game.renderLayers.RenderLayerList;
import gameEngine.interfaces.RenderLayer;

import java.awt.Canvas;
//import java.util.ArrayList;
import java.awt.Dimension;
//import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
//import java.awt.Image;
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
	
	
	
	
	while(true){
		Game.setMouseLoc(this.getMousePosition());// sends mouse location to Game or value storage.
		window.requestFocus();
		
		g2=(Graphics2D) strategy.getDrawGraphics();
		g2.setColor(Color.BLACK);
		g2.fillRect(0,0, 800, 600);
		
		
		for (RenderLayer renderThis : RenderLayerList.getRenderLayers()){
			
			renderThis.setDraw(g2);
			renderThis.renderThisLayer();
			
		}
		
		
		
		
		g2.dispose();
		
		strategy.show();
		
	
		
	}
		
	}
	
	public void doEntityGraphicsUpdate(){

		
	}

	public Graphics2D getG2() {
		return g2;
	}
	
	


}
