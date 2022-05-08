package Lab7;
import java.util.Scanner;

/**
 * File Name:Donations
 * Created by John Nixon on 17/10/2021
 * Program to accept variable donations from an unknown number of donors, announce target reached at £500,
 * how many donations received, who donated largest amount, and the value of largest donation
 **/
public class Donations
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //declare variables
      int donation, total = 0, noOfDonations = 0, largestAmount = 0;
      final int DONATION_TARGET = 500;
      String name, largestDonor = "";

      //do while loop until target of 500 met
      do
      {
         System.out.println("Please enter your name: ");
         name = keyboard.next();
         System.out.println("Please enter amount of donation: ");
         donation = keyboard.nextInt();
         total = total + donation;
         noOfDonations = noOfDonations + 1;

         if (donation > largestAmount)
         {
            largestAmount = donation;
            largestDonor =  name;
         }//if

      }while (total < DONATION_TARGET);

      //output to user
      System.out.println("The total amount of donations was " + noOfDonations);
      System.out.println("The largest donor was " + largestDonor + " who donated " + largestAmount);

   }//main
}//class
