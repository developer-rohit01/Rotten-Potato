
public class Mathe {

  public static void main(String[] args) {
    double num1 = 2.0;
    double num2 =3.0;
    

    // Rounding
    System.out.println("Rounded num1: " + Math.round(num1));
    System.out.println("Rounded num2: " + Math.round(num2));

    // Ceiling
    System.out.println("Ceiling of num1: " + Math.ceil(num1));
    System.out.println("Ceiling of num2: " + Math.ceil(num2));

    // Floor
    System.out.println("Floor of num1: " + Math.floor(num1));
    System.out.println("Floor of num2: " + Math.floor(num2));

    // Power
    System.out.println("Printing (num1+num2)² :"+Math.pow(num1+num2, 2));
    System.out.println("num1 raised to the power of num2: " + Math.pow(num1, num2));


    // Square Root
    System.out.println("Square root of num1: " + Math.sqrt(num1));
    System.out.println("Square root of num2: " + Math.sqrt(num2));

    // Absolute Value
    System.out.println("Absolute value of -num1: " + Math.abs(-num1));
    System.out.println("Absolute value of -num2: " + Math.abs(-num2));
    
  }
  
}
