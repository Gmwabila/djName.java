// Name: Gloire Mwabila
// Date: 10/09/2023
// Dscription
import java.util.Scanner;
  public class DjNameGenerator2 { 
   public static void main(String[] args) {
       // create an object type Scanner 
        Scanner keyboard = new Scanner(System.in);     
       // Ask the dj their first name
       System.out.print("What is your first name?");      
       String firstName = keyboard.nextLine();
       // Ask the dj their last name 
       System.out.print("What is your last name?");
       String lastName = keyboard.nextLine(); 
       
       // indicate dj name
       String firstPart, secondPart;
       if (firstName.length() % 2 == 0) {
       // next line take the first name has even characters
         firstPart = firstName.substring(0, firstName.length() / 2);
        } else {
        // it has odd characters 
        int midPart = firstName.length() / 2; 
        firstPart = firstName.substring(0, midPart); 
        }
         if (lastName.length() % 2 == 0) {
       // next line take the last name has even characters
         secondPart = lastName.substring(lastName.length() / 2);
        } else {
        // it has odd characters 
        int midPart = lastName.length() / 2; 
        secondPart = lastName.substring(midPart, lastName.length() -1); 
        }
         // generate the dj name
       String djName = firstPart + secondPart + "Jayster";
       System.out.println("Your DJ name is " + djName);
             
    }
}