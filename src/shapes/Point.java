package shapes;

import java.awt.Color;
import java.awt.Graphics;
//import java.util.Random;

public class Point extends Shapes{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Movement
  	boolean movingLeft;
  	boolean movingUp;
	public int Facing =1;
	private int xPos, yPos, size, radius;
	private Color color;
	// Facing
	//private int facing;
    public int up = 0, right = 1, down = 2, left = 3;
		 
    public Point(int x, int y, int s, Color c){
		        xPos=x;
		        yPos=y;
		        size=s;
		        radius = size/2;
		        color = c;
		  }
	    public int getX(){return xPos;}
	    public int getY(){return yPos;}
	
	    @Override
		public void drawShape(Graphics g) {
			g.setColor(color);
		    g.fillOval(xPos -(radius), yPos-(radius), size, size);
		    this.mover();
	    }
		
		@Override
		public void move() {
			// TODO Auto-generated method stub
		}
		@Override
		public void collision() {
			switch(Facing){
		    case 0:
		    	Facing = 3;
		    	break;
		    case 1:
		    	Facing = 0;
		    	break;
		    case 2:
		    	Facing = 2;
		    	break;
		    case 3: 
		    	Facing = 1;
		    	break;
		    default:
		    	break;
		    
		    }
		}  
		
		public void mover(){
			if (((xPos)) == 800){
				collision();
			} 
			if ((xPos) == 0){
				collision();
			} 
			if (yPos == 800){
				collision();
			}
			if (xPos == 0){
				collision();
			}
			    switch(Facing){
			    case 0: 
			    	yPos--;
			    	break;
			    case 1:
			    	xPos++;
			    	break;
			    case 2:
			    	yPos++;
			    	break;
			    case 3:
			    	xPos--;
			    	break;
			    default:
			    	break;
			    
			    }
			    
			  }
		
	    
}
