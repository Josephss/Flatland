package shapes;
// Imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	private static JFormattedTextField xPos_Input;
	private static JFormattedTextField yPos_Input;
	
	private static JLabel xPosLabel;
	private static Color coloring;
	
	public FlatLandMain(){ // Create a constructor to call the methods created down below
		shapes = new ArrayList<Shapes>(); 
		createInterface(); // Call the createInterface method
	    setVisible (true); // Set the window visible
	    setLocationRelativeTo(null); // Centers the JFrame by removing the default layout
	
	    }
	
    public void paint(Graphics g){
    	g.setColor(Color.orange);
    	g.fillRect (0, 80, 800, 800);
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
        showLabel();
    }
    public void add(Shapes s) {
		   shapes.add(s);
	   
    }
    public void buttonCode(){
    	JPanel panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        JButton button = new JButton("Point");
        panel.add(button);
        button.addActionListener (new Action1());

        JButton button2 = new JButton("Line");
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
        
        JButton button7 = new JButton("Color");
        button7.addActionListener(new Action7());
        panel.add(button7);
    }
    // Button one Action listener
    static class Action1 implements ActionListener {        
    	  public void actionPerformed (ActionEvent e) {
    		  int x =0;
    		  int y = 0;
              try{
                  x=Integer.parseInt(xPos_Input.getText());
                  y=Integer.parseInt(yPos_Input.getText());
              }
              catch(NumberFormatException ex){
                 // status.setText("Please input an integer number.");
              }
    		 Point p = new Point (x,y, 20, coloring);
    		  shapes.add(p);
    	  }
    	}  
    // Button two Action listener
    static class Action2 implements ActionListener {        
      public void actionPerformed (ActionEvent e) { 
    	  int x =0;
		  int y = 0;
          try{
              x=Integer.parseInt(xPos_Input.getText());
              y=Integer.parseInt(yPos_Input.getText());
          }
          catch(NumberFormatException ex){
             // status.setText("Please input an integer number.");
          }
    	  	Line l = new Line (x,100, 100,y, coloring);
    	  	  shapes.add(l);
      }
    }
    // Button three Action Listener
    static class Action3 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	int x =0;
  		    int y = 0;
            try{
                x=Integer.parseInt(xPos_Input.getText());
                y=Integer.parseInt(yPos_Input.getText());
            }
            catch(NumberFormatException ex){
               // status.setText("Please input an integer number.");
            }
        	Triangle t = new Triangle(x,450,550,y,550,550,coloring); // y=500
        	shapes.add(t);
        }
      }
    // Button four Action Listener
    static class Action4 implements ActionListener {        
        public void actionPerformed (ActionEvent e) { 
        	int x =0;
  		    int y = 0;
            try{
                x=Integer.parseInt(xPos_Input.getText());
                y=Integer.parseInt(yPos_Input.getText());
            }
            catch(NumberFormatException ex){
               // status.setText("Please input an integer number.");
            }
        	Square s = new Square(x,y,130,130, coloring);
        	shapes.add(s);
        }
      }
    
    // Button five Action Listener
    static class Action5 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	// call chebychev method
        	
        	button5.setEnabled(false);
        	button6.setEnabled(true);
        }
      }
    // Button six Action Listener
    static class Action6 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	// call manhattan method
        	button5.setEnabled(true);
        	button6.setEnabled(false);
        }
      }
    // Button seven Action Listener
    static class Action7 implements ActionListener {        
        public void actionPerformed (ActionEvent e) {     
        	colorChooser();
        }
      }
    // x and y Position input method
    public void x$y_Input(){
    	  xPos_Input = new JFormattedTextField(xPos_Input);
    	  xPos_Input.setValue(200);
    	  xPos_Input.setColumns(5);
    	  xPos_Input.setLocation(20,10);
    	  xPos_Input.setSize(10,20);
    	  yPos_Input = new JFormattedTextField(yPos_Input);
    	  yPos_Input.setValue(100);
    	  yPos_Input.setColumns(5);
    	  yPos_Input.setLocation(20,10);
    	  JPanel panel2 = new JPanel();
    	  add(panel2, BorderLayout.LINE_START);
    	  panel2.add(xPos_Input);
    	  panel2.add(yPos_Input);
    }
    public JFormattedTextField getxPos_Input(){
    	return xPos_Input;
    }
    public JFormattedTextField getyPos_Input(){
    	return yPos_Input;
    }
    private void showLabel(){
        xPosLabel = new JLabel ("Please enter x and the y postion.");
        xPosLabel.setBounds(10, 75, 30, 30);
        xPosLabel.setLocation(50,10);
        add(xPosLabel, BorderLayout.PAGE_START);
    }
    public static void colorChooser(){
    	 JFrame frame = new JFrame();
    	 Color color = JColorChooser.showDialog(frame, "Choose a color", Color.blue);
    	 coloring = color;
    	 //System.out.println("The selected color was:" + color);
    }
}