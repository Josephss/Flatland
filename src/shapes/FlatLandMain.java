package shapes;
// Imports
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

public class FlatLandMain extends JFrame{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L; // Eclipse generated this line to identify it from the other class
	Shapes shapers; // call the shapes class
	  
	// Array list for the shapes class
	ArrayList<Shapes> shapes;
	   
	public FlatLandMain(){ // Create a constructor to call the methods created down below
		shapes = new ArrayList<Shapes>(); 
		createInterface(); // Call the createInterface method
	    setVisible (true); // Set the window visible
	    setLocationRelativeTo(null); // Centers the JFrame by removing the default layout
	    }
    
    // The GOD of the application
    public void paint(Graphics g){
    	g.setColor(Color.orange);
    	g.fillRect(0, 0, 800, 800); 
    	if(shapes==null){
            return;
        }
  
        for (Shapes n : shapes){
           n.draw(g);
           
        }
    }

    private void createInterface(){
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
}
