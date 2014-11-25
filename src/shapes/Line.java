package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line {
	
	  private int xPos, yPos, size,size2;
	  private Color color;
		      
		  public Line(int x, int y, int s,int r, Color c){
		        xPos=x;
		        yPos=y;
		        size=s;
		        size2 =r;
		        color = c;
		  }
		  
		    public int getX(){return xPos;}
		    public int getY(){return yPos;}
		    public int getSize(){return size;}
		    public Color getColor(){return color;}
		    public void setColor(Color c){color = c; }
		    
		    public void draw(Graphics g){
		    	 g.setColor(color);
			     g.drawLine(xPos, yPos, size, size2);
			     xPos++;
			     size++;
			     //xPos = Math.max(9,xPos-1); 
		    } 
}
