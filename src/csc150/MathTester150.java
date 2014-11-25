package csc150;

/**
 *
 * @author Joseph
 */
public class MathTester150 {
 
  
    public static void main(String[] args) {
        int number1 = (-5);
        int number2;
        number2 = MATH150.abs(number1);
        
        System.out.println("The absolute value of the intger is: " + number2);
        
        float number3 = (float) (-5.6);
        float number4;
        
        
        number4 = MATH150.abs(number3);
        
        System.out.println("The absolute value of the float is: " + number4);
        
        double number5 = (-5.66776776);
        double number6;
        
       
     
        number6 = MATH150.abs(number5);
        
        System.out.println("The absolute value of the double is: " + number6);
        
        byte number7 = (byte) (-22); // cast the integer as a byte!
        byte number8;
       
        
        number8 = MATH150.abs(number7);
        
        System.out.println("The absolute value of the byte is: " + number8);
        
        short number9 = (short) (55.2343234);
        short number10;
        
        number10 = MATH150.abs(number9);
        
        System.out.println("The absolute value of the short is: " + number10);
        
        long number11 = (long) (-34534534.34534534534);
        long number12;
        
        number12 = MATH150.abs(number11);
        
        System.out.println("The absolute value of the long is: " + number12);
        
        System.out.println("is divible: " + MATH150.isDivisible(11, 5));
        
        // Tester for the max method
        
        // Test for a byte number
        byte n1 = (byte) (128);
        byte n2 = (byte) (111);
        System.out.println("The maximum byte number is: " + MATH150.max(n1, n2));
        
        // Test for a long number
        long n12 = (long) (20394884);
        long n22 = (long) (238432022);
        System.out.println("The maximum long number is: " + MATH150.max(n12, n22));
        
        // Test for short number
        short n13 = (short) (28123);
        short n23 = (short) (3452);
        System.out.println("The maximum short number is: " + MATH150.max(n13, n23));
        
        // Test to get the square root of a number
        System.out.println("The square root of the number is: "+MATH150.sqRoot(121));
        
        // Test for GCD
        System.out.println("The greatest common denominator is: "+MATH150.GCD(5,10));
        
        // Test for a prime number
        System.out.println("Is 25 a prime? " + MATH150.isPrime(25));
        
        
      
    }
  
  
}
