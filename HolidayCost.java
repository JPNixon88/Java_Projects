package Lab3;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * File Name: HolidayCost
 * Created by John Nixon on 27/09/2021
 * Program for user entry of flight and transfer cost, and to calculate total cost
 **/
public class HolidayCost
{

   public static void main(String[] args)
   {
      final double VATRATE = (0.20);
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("0.00");
      int noOfPeople;
      double flightCost, transferCost, flightTotal, transferTotal, totalCost;

      System.out.println("How many people are travelling?");
      noOfPeople = keyboard.nextInt();
      System.out.print("\n");

      System.out.println("Enter the cost of each flight: £");
      flightCost = keyboard.nextDouble();

      System.out.println("Enter the cost of each transfer: £");
      transferCost = keyboard.nextDouble();
      System.out.print("\n");

      flightTotal = (flightCost * noOfPeople) * (1 +VATRATE);
      transferTotal = (transferCost * noOfPeople) * (1 + VATRATE);
      totalCost = flightTotal + transferTotal;

      System.out.println("Total cost for flights: £" + df.format(flightTotal));
      System.out.println("Total cost for transfers: £" + df.format(transferTotal));
      System.out.print("\n");

      System.out.println("Total cost: £" + df.format(totalCost));

   }//main
}//class
