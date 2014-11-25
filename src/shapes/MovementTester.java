package shapes;

/**
 *
 * @author Joseph
 */
public class MovementTester {
    
    public static void main(String[] args){
        
//        Point xposition = new Point("Testname",3,4); // custom object initialization by providing the three aguments: Testname, 3, and 4.
//        
//        System.out.println(xposition.toString()); // print the intialized object to the screen.
//        System.out.println("The distance between 3 and 4 is: " + Point.distancePythagorean(3, 4));
//        
//        // Test for the phytagorean distance
//        System.out.println("The phytagorean distance between 3 and 4 is: " + Point.distancePythagorean(6, 8));
//        
//        // Test for the manhattan distance
//        System.out.println("The manhattan distance between 3 and 4 is: " + Point.distanceManhattan(6, 8));
//        
//        // Test for the chebyschev distance -- Recode -..-
//        System.out.println("The chebyschev distance between 3 and 4 is: " + Point.distanceChebyschev(6, 8));
//        
//        // Test for the point ...
//        Point point = new Point();
//        System.out.println();
//        System.out.println(point.move(2)+ ". The left point is: " +  point.turnLeft() + " and the right point is: " + point.turnRight());
//       
       
     Movement p1=new Movement("A",3,4);
     p1.move(10);
     p1.turnLeft();
     p1.move(8);
     System.out.println(p1.newPoint());
     //   System.out.println(p1.getXPos()+"\t"+p1.getYPos());
             
    }
    
}
