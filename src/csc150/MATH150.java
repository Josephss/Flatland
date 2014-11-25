package csc150;

/**
 *
 * @author Joseph
 */
public class MATH150 {
      public static int abs(int integerNumber){
      if (integerNumber < 0) {
          integerNumber = integerNumber * (-1);
      } else {
          return integerNumber;
          
             }
        return integerNumber;
      
        }
    public static float abs(float floatNumber){
       if (floatNumber < 0) {
           floatNumber = floatNumber * (-1);
       } else{
           return floatNumber;
       }
        return floatNumber;
    }
    public static double abs(double doubleNumber){
       if (doubleNumber < 0){
           doubleNumber = doubleNumber * (-1);
       } else{
           return doubleNumber;
            }
        return doubleNumber;
    }
    public static byte abs(byte byteNumber){
        if (byteNumber < 0){
            byteNumber = (byte) (byteNumber *(-1)); // cast the number as a byte
        } else{
            return byteNumber;
        }
        return byteNumber;
        
    }
    public static short abs(short shortNumber){
        
        if (shortNumber < 0){
            shortNumber = (short) (shortNumber * (-1)); // cast the numeber as short
        } else {
            return shortNumber;
        }
        
        return shortNumber;
        
    }
    public static long abs(long longNumber){
        
        if (longNumber < 0){
            longNumber = (long)(longNumber * (-1));
            
        }else {
            return longNumber;
        }
        return longNumber;
        
                
    }
    public static int max(int a, int b){
        return a + b;
        
    }
    public static boolean isDivisible(int a, int b){
        
      if ((a%b == 0)){
          return true;
      }
      return false;
      
             
    }
    
    public static byte max(byte a, byte b){
        if (a > b){
            return a;
        }
        return (byte) b;
        
    }
    public static short max(short a, short b){
        if (a>b){
            return (short) a;
            
        }
        return b;
    }
    public static long max(long a, long b){
        if (a>b){
            return (long) a;
            
        }
        return (long)b;
        
    }
   
    public static int sqRoot(int n){
        double a=1;
        double b= (n/a);
        do {
            a = ((a+b)/2);
            b = (n/a);
            
        } while(MATH150.abs(a-b)>.1);
        return (int) (double) a;
        
    }
    public static int GCD(int a, int b){
        do{
          if (b==0) return a;
  
           return GCD(b,a%b); 
           
        } while(b!=0);
        
      } 
    public static boolean isPrime(int number){
        int counter =0;
                
    // The structure of if statement is: initialize the variable; while it fullfills some requirement; do something.
        
        for (counter = 2; counter <= Math.sqrt(number); counter++){
           if (number%counter == 0){
               return false;
               
           }
        }
        return true;
    
        
    }
    
}  
  
