package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shapes  {

	  	 /**
	 * 
	 */
	// Movement
  	boolean movingLeft;
  	boolean movingUp;
  	
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
				 g.setColor(color);
			     g.fillRect(xPos, yPos, width, height);
			     move();
			}
			@Override
			public void move() {
				  if((xPos+width) == 800){
					  movingLeft= true;
				  }
				  if((xPos)==0){
					  movingLeft= false;
					  
				  }
				  if (yPos+height == 800){
					// movingUp = true;
				  }
				  if(yPos == 0){
					 // movingUp = false;
				  }
				  if (movingLeft){
					  xPos--;
				  } else{
					  xPos++;
				  }
				  if (movingUp){
					 // yPos--;
				  } else{
					 // yPos++;
				  }
			}
			@Override
			public void collision() {
				// TODO Auto-generated method stub
				
			} 

}
