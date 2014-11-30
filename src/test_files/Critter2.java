package test_files;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jim.j.perry
 */
public class Critter2{
		    private int xPos, yPos, size,radius;
		    private Color shade;
		        /**
		     * Private zero-parameter constructor to prevent instantiation without 
		     * size specification by general users of the class.
		     */
		 
		 	boolean movingLeft;
		   public Critter2(int x, int y, int s, Color c){
		        xPos=x;
		        yPos=y;
		        size=s;
		        radius = size/2;
		        shade = c;
		    }
		    
		    public int getX(){return xPos;}
		    public int getY(){return yPos;}
		    public int getSize(){return size;}
		    public Color getColor(){return shade;}
		    public void setColor(Color c){shade = c; }
		    
		    public void draw(Graphics g){
		       g.setColor(shade);
		       g.fillOval(xPos, yPos, size, size);
		      // xPos=Math.max(5,xPos-1);
		       if(xPos+radius == 300){
					  movingLeft= true;
				  }
				  if(xPos-radius==0){
					  movingLeft= false;
					  
				  }
				  if (movingLeft){
					  xPos--;
				  } else{
					  xPos++;
				  }
		    }  
    
}
