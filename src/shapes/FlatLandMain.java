package shapes;
// Imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlatLandMain extends JFrame{
   /**
	 * 
	 */
	 // Excluded the two buttons in order to change their visibility.
    static JButton button5 = new JButton("Manhattan");
    static JButton button6 = new JButton("Chebychev");
   
    
    private static final long serialVersionUID = 1L; // Eclipse generated this line to identify it from the other class
	// Array list for the shapes class
	static ArrayList<Shapes> shapes;
	
	private JFormattedTextField xPos_Input;
	private JFormattedTextField yPos_Input;
  
	public FlatLandMain(){ // Create a constructor to call the methods created down below
		shapes = new ArrayList<Shapes>(); 
		createInterface(); // Call the createInterface method
	    setVisible (true); // Set the window visible
	    setLocationRelativeTo(null); // Centers the JFrame by removing the default layout
	   // buttons();
	    }
 
    // The GOD of the application
    public void paint(Graphics g){
    	setAlwaysOnTop(true);// -- Sample code
    	g.setColor(Color.orange);
    	//g.fillRect(0, 0, 800, 800);
    	g.fillRect (0, 75, 800, 800);
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
        buttonCode();
        x$y_Input();
    }
    public void add(Shapes s) {
		   shapes.add(s);
	   
    }
    public void buttonCode(){
    	
        JPanel panel = new JPanel();
        add(panel);
        JButton button = new JButton("Point");
        panel.add(button);
        button.addActionListener (new Action1());

        JButton button2 = new JButton("LIne");
        panel.add(button2);
        button2.addActionListener (new Action2());
        
        JButton button3 = new JButton("Triangle");
        panel.add(button3);
        button3.addActionListener (new Action3());
        
        JButton button4 = new JButton("Square");
        panel.add(button4);
        button4.addActionListener (new Action4());
        
     
        panel.add(button5);
        button5.addActionListener (new Action5());
        
      
        panel.add(button6);
        button6.addActionListener (new Action6());
        
       
        
    }
    // Button one Action listener
    static class Action1 implements ActionListener {        
    	  public void actionPerformed (ActionEvent e) {     
    		 Point p = new Point (190,290, 20, Color.GREEN);
    		  shapes.add(p);
    	  }
    	}  
    // Button two Action listener
    static class Action2 implements ActionListener {        
      public void actionPerformed (ActionEvent e) {     
    	  	Line l = new Line (200,100, 100,100, Color.RED);
    	  	  shapes.add(l);
      }
    }
    // Button three Action Listener
    static class Action3 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	Triangle t = new Triangle(500,450,550,500,550,550,Color.WHITE);
        	shapes.add(t);
        }
      }
    // Button three Action Listener
    static class Action4 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	Square s = new Square(300,300,130,130, Color.CYAN);
        	shapes.add(s);
        }
      }
    
    // Button three Action Listener
    static class Action5 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	// call chebychev method
        	button5.setEnabled(false);
        	button6.setEnabled(true);
        }
      }
    // Button three Action Listener
    static class Action6 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	// call manhattan method
        	button5.setEnabled(true);
        	button6.setEnabled(false);
        }
      }
    // x and y Position input method
    public void x$y_Input(){
    	  xPos_Input = new JFormattedTextField(xPos_Input);
    	  xPos_Input.setValue(1);
    	  xPos_Input.setColumns(3);
    	  xPos_Input.setLocation(20,10);
    	  yPos_Input = new JFormattedTextField(yPos_Input);
    	  yPos_Input.setValue(3);
    	  yPos_Input.setColumns(3);
    	  yPos_Input.setLocation(20,10);
    	  JPanel panel2 = new JPanel();
    	  add(panel2, BorderLayout.LINE_END);
    	  panel2.add(xPos_Input);
    	  panel2.add(yPos_Input);
    }
    
}