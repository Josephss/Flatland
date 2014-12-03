package shapes;

import java.awt.Color;




public class FlatLandAction{
    public static void main(String args[]){
    	FlatLandMain f = new FlatLandMain();
    	f.add(new Point (190,290, 20, Color.GREEN));
    	f.add(new Point (120,120, 20, Color.RED));
    	f.add(new Point (600,600, 20, Color.PINK));
        f.add(new Line (200,100, 100,100, Color.RED));
        f.add(new Square(300,300,130,130, Color.CYAN));
        f.add(new Square(200,200,50,50, Color.CYAN));
        f.add(new Triangle(500,450,550,500,550,550,Color.WHITE));
        
       // Game loop
        while(true){
            long nextTime = System.currentTimeMillis()+5;//supposed to be 41 or 42
            while (System.currentTimeMillis()<nextTime);
            f.repaint();

        }
        
    }
}
