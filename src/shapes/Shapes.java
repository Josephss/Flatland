package shapes;

import java.awt.Color;
import java.util.ArrayList;

public class Shapes {
	// Make the shape class an abstract class
	/*
	 * Create an abstract class and add an abstract voice for the speak ...
	 */
		ArrayList<Point> points;
		ArrayList<Line> lines; 
		ArrayList<Square> square;
		ArrayList<Triangle> triangle;
		
		public Shapes() {
			points = new ArrayList<Point>();
			Point p = new Point (10,100, 10, Color.GREEN);
			points.add(p);
			lines = new ArrayList<Line>();
		    Line l = new Line (200,100, 100,100, Color.BLUE);
		    //Line l2 = new Line (100,10, 100,100, Color.ORANGE);
		    lines.add(l);
		    //lines.add(l2);
			//Create the lines ...
			square = new ArrayList<Square>();
		    Square s = new Square(300,300,130,Color.BLUE);
		    square.add(s);
			//Create the Square
			triangle = new ArrayList<Triangle>();
			Triangle t = new Triangle(500,450,550,500,550,550,Color.BLACK);
			triangle.add(t);
			//Create the triangle
			
		}
		
		public void Draw(){
			// isLine
			
			// isPoint
			
			// isTraingle
			
			// isSquare
			
		}
		public void Remove(){
			// ArrayList remove the element
			// Arraylist.Remove
			
		}
		public void turnLeft(){
			
		}
		public void turnRight(){
			
		}
		public void deltaLife(){
			
		}
		public void isWall(){
			
		}
		public void isShape(){
			
		}
		public void move(){
			
		}
}
