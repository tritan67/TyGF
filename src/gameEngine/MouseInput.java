package gameEngine;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Game.setMouseClicks(true, e.getButton()-1);
		//System.out.println("hax");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Game.setMouseClicks(false, e.getButton()-1);
	}

}
