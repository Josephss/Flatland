package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shapes  {

	  	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int xPos, yPos, width;
		 private Color color;
		      
		  public Square(int x, int y, int size, Color c){
		        xPos=x;
		        yPos=y;
		        width=size;
		        color = c;
		  }
		    public int getX(){return xPos;}
		    public int getY(){return yPos;}
		    
		    public Color getColor(){return color;}
		    public void setColor(Color c){color = c; }
		    
		    public void draw(Graphics g){
		        g.setColor(color);
		        g.fillRect(xPos, yPos, width, width);
		        xPos++;
		        //xPos = Math.max(10,xPos-1); 
		    } 

}
