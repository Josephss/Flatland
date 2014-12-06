package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public abstract class Shapes extends JFrame{
	/**
	 * 
	 */
	// Abstract methods
	public abstract void drawShape(Graphics g);
	public abstract void move();
	public abstract void collision();
	
	// Global variables
	private static final long serialVersionUID = 1L;
	public int HEALTH;
	public int xPos;
	public int yPos;
	public Color COLOR;
	public int FACING =1;
	
	
	// ArrayList to hold unlimited shapes
	ArrayList<Shapes> shapes;
	public int getFacing(){
		return FACING;
	}
		public Shapes() {}
		
		// Draw method	
		public void draw(Graphics gr){
			drawShape(gr);
		}
		
		public void update(){
			move();
			HEALTH--;
		}
		public void move_1(){
			Random random = new Random();
			//for (int i = 0; i < 20; i++) {
            int randXLoc = random.nextInt(10);
            int randYLoc = random.nextInt(20);
            xPos = randXLoc;
    		yPos = randYLoc;
			//}
		
			
		}
		
		public void hasCollided(){
					
		}
		public void Remove(int n){
			shapes.remove(n);
		}
		
		 public int getX(){return xPos;}
		 public int getY(){return yPos;}
		
}
