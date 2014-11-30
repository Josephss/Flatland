package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shapes{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xPos1, yPos1, xPos2,yPos2;
	  private Color color;
		      
		  public Line(int x, int y, int s,int r, Color c){
		        xPos1=x;
		        yPos1=y;
		        xPos2=s;
		        yPos2 =r;
		        color = c;
		  }
		  
		    public int getX(){return xPos1;}
		    public int getY(){return yPos1;}
		  
		    //public Color getColor(){return color;}
		    public void setColor(Color c){color = c; }
		    
		    public void draw(Graphics g){
		    	 g.setColor(color);
			     g.drawLine(xPos1, yPos1, xPos2, yPos2);
			     xPos1++;
			     xPos2++;
	    } 
}
