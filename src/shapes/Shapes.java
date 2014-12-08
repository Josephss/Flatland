package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

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
	public int movementType;
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
			//move();
			HEALTH--;
		}
		public void hasCollided(){
					
		}
		public void Remove(int n){
			shapes.remove(n);
		}
		
		
}
