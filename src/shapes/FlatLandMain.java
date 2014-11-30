package shapes;
import java.awt.Color;


import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;


// Master each line of code
public class FlatLandMain extends JFrame{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L; // Eclipse generated this line to identify it from the other class
	Shapes shapers; // call the shapes class
	
	Point point; // call the point class
	Line line; // call the line class
	Triangle triangle; // call the triangle class
	Square square; // call the square class
	  
	// Array list for the shapes class
	ArrayList<Shapes> shapes;
	   
	public FlatLandMain(){ // Create a constructor to call the methods created down below
		shapes = new ArrayList<Shapes>(); 
		createInterface(); // Call the createInterface method
	    setVisible (true); // Set the window visible
	        
	}
    
    // The GOD of the application
    public void paint(Graphics g){
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, 800, 800); 
    	
    	// For loop to create a line from the Line ArrayList in the shape class
//    	for (int i = 0; i < shapes.points.size(); i++) {
//    		shapes.points.get(i).draw(g);
//    		
//    	}
//    	// For loop to create a point from the Point ArrayList in the shape class
//    	for (int i = 0; i < shapes.points.size(); i++) {
//    		shapes.points.get(i).draw(g);
//    		}
//    	// For loop to create a square from the Square ArrayList in the shape class
//    	for (int i = 0; i < shapes.square.size(); i++) {
//    		shapes.square.get(i).draw(g);
//    		}
//    	// For loop to create a triangle from the Triangle ArrayList in the shape class
//    	for (int i = 0; i < shapes.triangle.size(); i++) {
//    		shapes.triangle.get(i).draw(g);
//    		}
    	if(shapes==null){
            return;
        }
  
        for (Shapes n : shapes){
           n.draw(g);
        }
    	
    	
     }

    private void createInterface(){
    	// Comment each line of code!
    	
  
        setSize(800,800); // sets the size of the window
        setBounds(0,0, 800, 800);
        setTitle("Joseph Mammo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
    }
    	
	   public void add(Shapes s) {
		   shapes.add(s);
	   }
	   public void point(Point p){
		   point = p;
	   }
	   public void line(Line l){
		   line = l;
	   }
	   public void triangle(Triangle t){
		   triangle = t;
	   }
	   public void square(Square s){
		   square = s;
	   }
}
