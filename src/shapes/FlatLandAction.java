package shapes;


public class FlatLandAction{
    public static void main(String args[]){
    	FlatLandMain f = new FlatLandMain();
//        Shapes s11 = new Shapes(); // Create shapes Shapes Array
//        f.setShapes(Shapes.class);
//       
       // Game loop
        while(true){
            long nextTime = System.currentTimeMillis()+41;//supposed to be 41 or 42
            while (System.currentTimeMillis()<nextTime);
            f.repaint();

        }
        
    }
}