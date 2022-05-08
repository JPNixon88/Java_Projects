package Lab8;
import java.util.Scanner;
/**
 * File Name: SportsMembership
 * Created by John Nixon on 15/10/2021
 * Program to prompt user for key membership details (initials and PIN), and then identify and inform
 * user of any membership discounts they are entitled to depending on details input
 **/
public class SportsMembership {

   public static void main(String[] args)
   {
       //declare variables for program
       Scanner keyboard = new Scanner(System.in);
       String customerInitials;
       int customerPIN, noOfSwimsSessions, noOfGymSessions, totalSessions;
       final int GOLDNUMBER = 60, SILVERNUMBER = 20, BRONZENUMBER =10;
       final String GOLD = "50%";//minimum of 60 activities total for 50% discount
       final String SILVER = "30%";//minimum of 20 swims and 20 gyms for 30% discount
       final String BRONZE = "10%";//minimum of 10 swims and 10 gyms for 10% discount
       final String GYM_NAME = "Universal Gym";
       char answer;

       do
       {
           //prompt user for required information
           System.out.println("Welcome to " + GYM_NAME + ", please enter customer initials: ");
           customerInitials = keyboard.next();
           System.out.println("Please enter four digit customer PIN: ");
           customerPIN = keyboard.nextInt();
           System.out.println("Please enter number of swim sessions: ");
           noOfSwimsSessions = keyboard.nextInt();
           System.out.println("Please enter number of gym sessions: ");
           noOfGymSessions = keyboard.nextInt();

           //calculation for total number of sessions
           totalSessions = noOfGymSessions + noOfSwimsSessions;

           //output of user information
           System.out.println("CLIENT ID\t\t" + "Swims\t" + "Gym\t" + "Overall Activities");
           System.out.println(customerInitials + " " + customerPIN + "\t\t" + noOfSwimsSessions
                 + "\t\t" + noOfGymSessions + "\t" + totalSessions + "\n");

           //if statement printing output dependent award
           if (totalSessions >= GOLDNUMBER)
           {
               System.out.println("Congratulations, you have been awarded Gold discount of " + GOLD);
           }//if
           else if ((noOfSwimsSessions >= SILVERNUMBER )
                 && (noOfGymSessions >= SILVERNUMBER))
                {
                    System.out.println("Congratulations, you have been awarded Silver discount of " + SILVER);
                }//if
                else if ((noOfSwimsSessions >= BRONZENUMBER )
                            && (noOfGymSessions >= BRONZENUMBER))
                     {
                        System.out.println("Congratulations, you have been awarded Bronze discount of " + BRONZE);
                     }//if
                     else
                     {
                        System.out.println("Unfortunately you have not been awarded any discounts this time, keep trying");
                     }//else

           //prompt user for further entries or to end loop
           System.out.println();
           System.out.println("Do you want to enter another member? Y for yes, or N for no");
           answer = keyboard.next().charAt(0);
           System.out.println();
       }while (answer == 'Y' || answer == 'y');
   }//main
}//class
