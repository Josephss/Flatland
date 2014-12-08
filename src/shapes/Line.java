package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shapes{
	
	  /**
	 * 
	 */
	
	// Movement
	      boolean movingLeft;
	      boolean movingUp;
	  	
		  private static final long serialVersionUID = 1L;
		  private int xPos1 = 12; 
		  private int yPos1 = 12;
		  private int xPos2 = 24;
		  private int yPos2 = 34;
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
		    public void setColor(Color c){color = c; }
		   
			@Override
			public void drawShape(Graphics g) {
				 g.setColor(color);
			     g.drawLine(xPos1, yPos1, xPos2, yPos2);
			     move();
			}
			

			@Override
			public void move() {
				if(xPos1 == 800){
					  movingLeft= true;
				  }
				  if(xPos1+xPos2==0){
					  movingLeft= false;
					  
				  }
				  if(yPos1 == 800){
					  movingUp= true;
				  }
				  if((yPos1&yPos2)==85){
					  movingUp= false;
					  
				  }
				  if (movingLeft){
					  xPos1--;
					  xPos2--;
				  } else{
					  xPos1++;
					  xPos2++;
				  }
				  if (movingUp){
					  yPos1--;
					  yPos2--;
				  } else{
					  yPos1++;
					  yPos2++;
				  }
			}

			@Override
			public void collision() {
				// TODO Auto-generated method stub
				
			} 
}
