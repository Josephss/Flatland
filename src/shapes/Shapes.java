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
	public abstract void move(int xPos, int yPos);
	
	// Global variables
	private static final long serialVersionUID = 1L;
	public int HEALTH;
	public int X;
	public int Y;
	public Color COLOR;
	public int FACING;
	
	// Global final variables for the moving the objects
	public final int YUP =1;
	public final int Y_XRIGHT =2;
	public final int XRIGHT =3;
	public final int X_YRIGHT =4;
	public final int YDOWN=5;
	public final int Y_XLEFT=6;
	public final int XLEFT=7;
	public final int X_YLEFT=8;
	
	// ArrayList to hold unlimited shapes
	ArrayList<Shapes> shapes;
		
		public Shapes() {}
		
		// Draw method	
		public void draw(Graphics gr){
			drawShape(gr);
		}
		
		public void update(){
			move();
			HEALTH--;
		}
		public int move(){
			switch(FACING){
            case 0:
            	FACING = YUP;
                break;
            case 1:
            	FACING = YDOWN;
                break;
            case 2:
            	FACING = XRIGHT;
                break;
            case 3:
            	FACING = XLEFT;
                break;
            default:
                System.out.println("Please try agian!");
                break;
        }
       return FACING;
       
		}
		
		
		// Collision
				public void isWall(){
					
				}
				public void isShape(){
					
				}
				public void Remove(){
					// ArrayList remove the element
					// Arraylist.Remove
					
				}
		
}
