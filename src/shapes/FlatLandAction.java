package shapes;
import java.awt.Color;

public class FlatLandAction{
    public static void main(String args[]){
    	FlatLandMain f = new FlatLandMain();
    	
    	f.add(new Point (190,290, 20, Color.GREEN));
    	f.add(new Point (120,120, 20, Color.RED));
    	f.add(new Point (600,600, 20, Color.PINK));
        f.add(new Line (200,100, 100, Color.RED));
        f.add(new Triangle(250,250,80,Color.WHITE));
        f.setVisible(true);
        
       // Game loop
        while(true){
            long nextTime = System.currentTimeMillis()+21;//supposed to be 41 or 42
            while (System.currentTimeMillis()<nextTime);
            f.repaint();

        }
        
       
    }
}
