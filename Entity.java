import java.awt.Image;
import java.io.File;
import java.io.Serializable;
//import java.io.File;

import javax.imageio.ImageIO;


public abstract class Entity implements Serializable {

	private volatile double X,Y,DX,DY;
	private String ImageName;
	private Image myImage;
	private boolean MarkForRemovel;
	
	
	
	public Entity(double x, double y, String imageName) {
		super();
		X = x;
		Y = y;
		ImageName = imageName;
		
		try{
		myImage= ImageIO.read(new File(imageName));
	}
	
	
	catch(Exception e){
		System.out.println(e.toString());
		
	}
	}

	abstract void DoLogic(long delta);
	
	
	
	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}

	public double getDX() {
		return DX;
	}

	public void setDX(double dX) {
		DX = dX;
	}

	public double getDY() {
		return DY;
	}

	public void setDY(double dY) {
		DY = dY;
	}

	public String getImageName() {
		return ImageName;
	}

	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	public Image getMyImage() {
		return myImage;
	}

	public void setMyImage(Image myImage) {
		this.myImage = myImage;
	}



	public boolean isMarkForRemovel() {
		return MarkForRemovel;
	}



	public void setMarkForRemovel(boolean markForRemovel) {
		MarkForRemovel = markForRemovel;
	}
	
	public void doMovement(long delta){
		double dDelta = delta;
		dDelta/=1000000;
		
		X+=DX*dDelta;
		Y+=DY*dDelta;
		//System.out.println("x"+X);
	}
	
	public void addVel(double dx,double dy){
		this.DX+=dx/10000000;
		this.DY+=dy/10000000;
		
	}
	
	
}
