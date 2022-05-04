package Lab4;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * File Name: Tickets
 * Created by John Nixon on 01/10/2021
 * Program is designed to prompt user for input of first name and surname, and number of tickets required. The program
 * then calculates cost of tickets and prints out all necessary information to the user (venue name, user name,
 * adult ticket amount and cost, junior ticket amount and cost, and total cost of tickets
 **/
public class Tickets {

   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner(System.in); //enable keyboard for user input
       DecimalFormat df = new DecimalFormat("#0.00"); //set decimal format for ticket cost

       final double COSTOFADULTTICKETS = 25.75; // assign cost of adult tickets as constant
       final double COSTOFJUNIORTICKETS = 14.50; // assign cost of junior tickets as constant
       final String NAMEOFVENUE = "Soccer World Park"; // assign name of venue as constant

       int numberOfAdultTickets, numberOfJuniorTickets; // identify the variables to be used for number
       String firstName, surname, fullName; // identify the variables ti be used for name

       //Prompts to user for input of first name and surname
       System.out.println("Please enter your first name: ");
       firstName = keyboard.next();
       System.out.println("Please enter your surname: ");
       surname = keyboard.next();
       fullName = firstName + " " + surname; // assigning full name by concatenation of user input for first name
       // and last name

       //Prompts to user for input of number of adult tickets and junior tickets
       System.out.println("Please enter number of adult tickets required: ");
       numberOfAdultTickets = keyboard.nextInt();
       System.out.println("Please enter number of junior tickets required: ");
       numberOfJuniorTickets = keyboard.nextInt();

       //Calculations for cost
       double totalCostAdultTickets = numberOfAdultTickets * COSTOFADULTTICKETS;
       double totalCostJuniorTickets = numberOfJuniorTickets * COSTOFJUNIORTICKETS;
       double totalCostOfTickets = totalCostAdultTickets + totalCostJuniorTickets;

       //Output for the user
       System.out.println("Venue: " + NAMEOFVENUE);
       System.out.print("\n\n");
       System.out.println("Bill for: " + fullName);
       System.out.print("\n");
       System.out.println("\tTotal number of adult tickets: " + numberOfAdultTickets + "\t\tCost: £" + df.format(totalCostAdultTickets));
       System.out.println("\tTotal number of junior tickets: " + numberOfJuniorTickets + "\t\tCost: £" + df.format(totalCostJuniorTickets));
       System.out.print("\n");
       System.out.print("Total cost of tickets: £" + df.format(totalCostOfTickets));



   }//main
}//class
