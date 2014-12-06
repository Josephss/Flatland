package shapes;
public class Movement { 

     
    // instance variables -- Declared inside a class, but not an object.
    private String critterName;
    private int xPos;
    private int yPos;
    private int facing;
    public int up = 0, right = 1, down = 2, left = 3;
    
    // Custom initialization of objects by the Point constructor.
    public Movement(String pointName, int x, int y){
        critterName = pointName;
        xPos = x;
        yPos = y;
        
    }
    
    // Setting the default values for the instance variables.
    public Movement(){
        
        critterName = "No Name";
        xPos = 0;
        yPos = 0;
        
    }
   
    @Override 
    public String toString(){
        return "The point, "  +  critterName + ",  is " + xPos + "  pixels left of the upper left-hand corner and " +  yPos + " pixels below the corner.";
    }
    
    public static double distancePythagorean(double Point1, double Point2){
       double distance;
       int xDefault = 3;
       int yDefault = 4;
       
       distance = Math.sqrt(((Point1*xDefault) + (Point2*yDefault)));
       return distance;
        
    }
    public static double distanceManhattan(double Point1, double Point2){
       double distance;
       int xDefault = 3;
       int yDefault = 4;
       
       distance = Math.abs(Point1 - xDefault) + Math.abs(Point2 - yDefault);
       return distance;
       
    }
    public static double distanceChebyschev(double Point1, double Point2){
       double distance;
       int xDefault = 3;
       int yDefault = 4;
       
       distance = Math.max(Math.abs(Point1 - xDefault), Math.abs(Point2 - yDefault));
       return distance;
       
    }
    // Accesors for the private variables
    public String getCritterName(){
        return critterName;
    }
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public int getFacing(){
        return facing;
    }
    
    // Turn left
    public int turnLeft(){
    switch(facing){
            case 0:
                facing = left;
                break;
            case 1:
                facing = up;
                break;
            case 2:
                facing = right;
                break;
            case 3:
                facing = down;
                break;
            default:
                System.out.println("Please try agian!");
                break;
        }
       return facing;
       
    }
    
    public int turnRight(){
        switch(facing){
            case 0:
                facing = right;
                break;
            case 1:
                facing = down;
                break;
            case 3:
                facing = up;
                break;
            case 2:
                facing = left;
                break;
                
            default:
                System.out.println("Please try agian");
                break;
            
        }
       return facing;
    }
    
   public void move(int movement){
        int face=getFacing();
        switch(face){
            case 0:
                yPos=yPos-movement;
                break;
             case 1:
                 xPos=xPos+movement;
                break;
             case 2:
                yPos=yPos+movement; 
                break;
             case 3:
                 xPos=xPos-movement;
                break;     
        }
    }
   // All in one accessor class
    public Movement newPoint(){
        int a=getXPos();
        int b=getYPos();
        String c="NEW POINT";
        Movement newP=new Movement(c,a,b);
        return newP;
        
    }
    
}
