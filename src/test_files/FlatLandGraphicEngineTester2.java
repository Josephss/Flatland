package test_files;
import java.awt.Color;


public class FlatLandGraphicEngineTester2 {
   
    public static void main(String args[]){
      
        FlatLandGraphicEngine2 f = new FlatLandGraphicEngine2();
             
        f.add(new Critter2 (90,90, 10, Color.RED));
        f.add(new Critter2 (190,190, 10, Color.BLUE));
        while(true){
            long nextTime = System.currentTimeMillis()+42;
            while (System.currentTimeMillis()<nextTime);          
            f.repaint();
        }
    }
}
