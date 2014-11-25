package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square {

	  	 private int xPos, yPos, size;
		 private Color color;
		      
		  public Square(int x, int y, int s, Color c){
		        xPos=x;
		        yPos=y;
		        size=s;
		        color = c;
		  }
		    public int getX(){return xPos;}
		    public int getY(){return yPos;}
		    public int getSize(){return size;}
		    public Color getColor(){return color;}
		    public void setColor(Color c){color = c; }
		    
		    public void draw(Graphics g){
		        g.setColor(color);
		        g.fillRect(xPos, yPos, size, size);
		        xPos++;
		        //xPos = Math.max(10,xPos-1); 
		    } 

}
