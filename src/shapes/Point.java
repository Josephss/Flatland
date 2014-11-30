package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Point {
	// Movement
  	boolean movingLeft;
	
	private int xPos, yPos, size, radius;
	private Color color;
	      
		  public Point(int x, int y, int s, Color c){
		        xPos=x;
		        yPos=y;
		        size=s;
		        radius = size/2;
		        color = c;
		  }
	    public int getX(){return xPos;}
	    public int getY(){return yPos;}
	    public void draw(Graphics g){
	    	g.setColor(color);
		    g.fillOval(xPos -(radius), yPos-(radius), size, size);
		    
//		  if(xPos+radius == 1000){
//			  movingLeft= true;
//		  }
//		  if(xPos-radius==0){
//			  movingLeft= false;
//			  
//		  }
//		  if (movingLeft){
//			  xPos--;
//		  } else{
//			  xPos++;
//		  }
		   
		   
		   
		   
	    }  
	    
}
