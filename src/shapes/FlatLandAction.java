package shapes;

import java.awt.Color;




public class FlatLandAction{
    public static void main(String args[]){
    	FlatLandMain f = new FlatLandMain();
    	f.add(new Point (190,190, 10, Color.BLUE));
        f.add(new Line (200,100, 100,100, Color.RED));
        f.add(new Square(300,300,130,130, Color.BLUE));
        f.add(new Triangle(500,450,550,500,550,550,Color.BLACK));
       // Game loop
        while(true){
            long nextTime = System.currentTimeMillis()+81;//supposed to be 41 or 42
            while (System.currentTimeMillis()<nextTime);
            f.repaint();

        }
        
    }
}
