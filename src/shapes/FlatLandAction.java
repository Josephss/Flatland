package shapes;

import java.awt.Color;




public class FlatLandAction{
    public static void main(String args[]){
    	FlatLandMain f = new FlatLandMain();
        //Shapes s11 = new Shapes(s); // Create shapes Shapes Array
       // f.add(Shapes);
//    
        f.point(new Point (190,190, 10, Color.BLUE));
       // Game loop
        while(true){
            long nextTime = System.currentTimeMillis()+41;//supposed to be 41 or 42
            while (System.currentTimeMillis()<nextTime);
            f.repaint();

        }
        
    }
}
