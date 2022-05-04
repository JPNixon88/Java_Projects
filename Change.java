package Lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * File Name: Change
 * Created by John Nixon on 28/09/2021
 * Program to read in the cost of an item sold and the amount of money tendered by the customer,
 * then print amount due, amount tendered, and change due
 **/
public class Change
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#0.00");// set decimal points

      double costOfItem, amountTendered, changeDue; // confirm variables

      //request for user input of item cost
      System.out.println("How much does the item cost? £");
      costOfItem = keyboard.nextDouble();

      //request for user input of cash tendered
      System.out.println("How much has been tendered? £");
      amountTendered = keyboard.nextDouble();

      changeDue = amountTendered - costOfItem; //calculation for change due

      //output of results for user
      System.out.println("Amount Due:          £" + df.format(costOfItem));
      System.out.println("Amount Tendered:     £" + df.format(amountTendered));
      System.out.println("Change Due:          £" + df.format(changeDue));

   }//main
}//class
