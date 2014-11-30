package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

public abstract class Shapes extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int HEALTH;
	public int X;
	public int Y;
	public Color COLOR;
	public int FACING;
	
	public final int YUP =1;
	public final int Y_XRIGHT =2;
	public final int XRIGHT =3;
	public final int X_YRIGHT =4;
	public final int YDOWN=5;
	public final int Y_XLEFT=6;
	public final int XLEFT=7;
	public final int X_YLEFT=8;
	// Make the shape class an abstract class
	/*
	 * Create an abstract class and add an abstract voice for the speak ...
	 */
//		ArrayList<Point> points;// Create Points arrayList	
//		ArrayList<Line> lines; // Create Line arrayList	
//		ArrayList<Square> square; // Create Square arrayLis
//	ArrayList<Triangle> triangle; // Create Triangle arrayList
//	
		//ArrayList<Shapes> shapes;
		
		public Shapes() {
		
//			Point p = new Point (10,100, 10, Color.GREEN);
//			points.add(p);
//		
//		    Line l = new Line (200,100, 100,100, Color.BLUE);
//		    //Line l2 = new Line (100,10, 100,100, Color.ORANGE);
//		    lines.add(l);
//		  
//			//Create the lines ...
//		
//		    Square s = new Square(300,300,130,Color.BLUE);
//		    square.add(s);
//			//Create the Square
//		
//			Triangle t = new Triangle(500,450,550,500,550,550,Color.BLACK);
//			triangle.add(t);
//			//Create the triangle
			
		}
		
		
		
		
		public void Remove(){
			// ArrayList remove the element
			// Arraylist.Remove
			
		}
		public void update(){
			move();
			HEALTH--;
		}
		// Collision
		public void isWall(){
			
		}
		public void isShape(){
			
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
}
