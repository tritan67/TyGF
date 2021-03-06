package gameEngine.interfaces;
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
	public long last=0;
	
	
	protected double getDeltaTime(){
		
	return (last-System.nanoTime())/1000000000.0;
	}
	
	protected void End(){
		
	last=System.nanoTime();	
	
	}
	
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

	public abstract void DoLogic();
	
	
	
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
		
		if(y>1000||y<0){
			Y=0;
		}
		else{
			Y=y;
		}
		
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
	
	public void doMovement(){
		
		X+=DX*getDeltaTime();
		Y+=DY*getDeltaTime();
		//System.out.println("x"+DY);
	}
	
	public void addVel(double dx,double dy){
		this.DX+=dx*getDeltaTime();
		this.DY+=dy*getDeltaTime();
		
	}
	
	
}
