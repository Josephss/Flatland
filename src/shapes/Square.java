package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shapes  {

	  	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		 private int xPos, yPos, width, height;
		 private Color color;
		      
		  public Square(int x, int y, int size_W,int size_H, Color c){
		        xPos=x;
		        yPos=y;
		        width=size_W;
		        height=size_H;
		        color = c;
		  }
		    public int getX(){return xPos;}
		    public int getY(){return yPos;}
		    public Color getColor(){return color;}
		    public void setColor(Color c){color = c;}
		   
			@Override
			public void drawShape(Graphics g) {
				// TODO Auto-generated method stub
				 g.setColor(color);
			     g.fillRect(xPos, yPos, width, height);
			}
			@Override
			public void move(int xPos, int yPos) {
				// TODO Auto-generated method stub
				xPos++;
				yPos++;
			} 

}
