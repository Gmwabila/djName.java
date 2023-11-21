// Name: Gloire Mwabila 
// Date: 10/9/2023
// Description 
import java.util.Scanner;
public class farmerCalculator {
      public static void main(String[] args) {
      // create an object type Scanner 
      Scanner scanner = new Scanner(System.in);
      // Ask the user for the radius of the circle
      System.out.print("What is the radius of the circle? "); 
      // declare a varible, call it radius, of type double
      double radius = scanner.nextDouble (); 

      // Ask the user for the length of the rectancle
      System.out.print("What is the length of the rectangle? "); 
      // Create a variable, call it length, of type double
      double length = scanner.nextDouble(); 
      
      // Ask the user for the width of the rectangle
      System.out.print("What is the width of the rectangle? ");
      // Create a variable, call it width, of type double
      double width = scanner.nextDouble(); 
      
      // Next line calculate the circle circumference and rectangle perimeter
      // Use the formula which has the pi * diameter.
      double circleCircumference = 2 * Math.PI * radius; 
      double rectanglePerimeter = 2 * (length + width);
      // Output the result to the screen 
      System.out.println("The circle circumference is " + circleCircumference);
      System.out.println("The perimeter of the recatngle is " + rectanglePerimeter); 
      
      scanner.close();
    }
}
      
