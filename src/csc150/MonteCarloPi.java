package csc150;
import java.util.*;
/**
 *
 * @author Joseph
 */
public class MonteCarloPi {
    
        public static double getPi(long numThrows){
		int inCircle= 0;
                
                Random R = new Random(System.currentTimeMillis());
                for(long i= 0; i < numThrows; i++){
                        double randX = R.nextDouble();
                        double randY = R.nextDouble();
                        double distance= Math.sqrt(randX * randX + randY * randY);
			if(distance < 1){
				inCircle++;
			}
		}
		return 4.0 * inCircle / numThrows;
	}   
        public static void main(String[] args) {
		
         System.out.println(getPi(10000000L));
         System.out.println(getPi(100231000L));
       
       
            
	}
	
 
        
}
