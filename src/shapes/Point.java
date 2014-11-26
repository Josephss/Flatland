package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Point {
	 private int xPos, yPos, size, radius;
	 private Color color;
	      
	  public Point(int x, int y, int s, Color c){
	        xPos=x;
	        yPos=y;
	        size=s;
	        radius = size/2;
	        color = c;
	  }
	  	
	  	// Movement
	  	boolean movingLeft;
	  	
	    public int getX(){return xPos;}
	    public int getY(){return yPos;}
	    public int getSize(){return size;}
	    public Color getColor(){return color;}
	    public void setColor(Color c){color = c; }
	 
	    public void draw(Graphics g){
	    	g.setColor(color);
		    g.fillOval(xPos -(radius), yPos-(radius), size, size);
		   /*
		    * public FillOval(int x,
                int y,
                int width,
                int height) -- draws the rectangle and then a circle
		    */
		  if(xPos+radius == 1000){
			  movingLeft= true;
		  }
		  if(xPos-radius==0){
			  movingLeft= false;
			  
		  }
		  if (movingLeft){
			  xPos--;
		  } else{
			  xPos++;
		  }
		   
		   
		   
		   
	    }  
	    
}
