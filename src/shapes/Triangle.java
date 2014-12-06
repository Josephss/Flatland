package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shapes{

	  	  /**
	 * 
	 */
	// Movement
	  	boolean movingLeft;
	  	
		  private static final long serialVersionUID = 1L;
		  private int xPos1, xPos2, xPos3, yPos1, yPos2, yPos3;
	  	  private Color color;
		      
		  public Triangle(int x1,int x2, int x3, int y1, int y2, int y3, Color c){
		        xPos1=x1;
		        xPos2=x2;
		        xPos3=x3;
		        yPos1=y1;
		        yPos2=y2;
		        yPos3=y3;
		        color = c;
		  }
		    public int getX1(){return xPos1;}
		    public int getX2(){return xPos2;}
		    public int getX3(){return xPos3;}
		    public int getY1(){return yPos1;} 
		    public int getY2(){return yPos2;}
		    public int getY3(){return yPos3;}
		    public Color getColor(){return color;}
		    public void setColor(Color c){color = c; }
		 
			@Override
			public void drawShape(Graphics g) {
				g.setColor(color);
		        g.drawLine(xPos1,yPos1,xPos2,yPos2);
		        g.drawLine(xPos2,yPos2,xPos3,yPos3);
		        g.drawLine(xPos1,yPos1,xPos3,yPos3);
		        move();
			}
			@Override
			public void move() {
				//move();
			      
		        if((xPos1) == 800){
					  movingLeft= true;
				  }
				  if((xPos1)==0){
					  movingLeft= false;
					  
				  }
				  if (movingLeft){
					  xPos1--;
					  xPos2--;
					  xPos3--;
				  } else{
					  xPos1++;
					  xPos2++;
					  xPos3++;
				  }
				  
		        
			}
			@Override
			public void collision() {
				// TODO Auto-generated method stub
				
			} 
}
