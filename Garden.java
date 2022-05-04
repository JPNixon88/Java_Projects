package Lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * File Name: Garden
 * Created by John Nixon on 30/09/2021
 * Program to find out what area of grass there is in a garden lawn. The lawn is square with a circular pond.
 **/
public class Garden
{

   public static void main(String[] args)
   {
      DecimalFormat df = new DecimalFormat("#0.00");
      Scanner keyboard = new Scanner (System.in);

      double gardenLength, radiusPond, gardenArea, pondArea, lawnArea; // identify variables to be used

      System.out.println("Please enter the length of the garden in metres: "); // request for user input
      gardenLength = keyboard.nextDouble();

      System.out.println("Please enter the radius of the pond in metres: "); // request for user input
      radiusPond = keyboard.nextDouble();

      //calculations for the required outputs
      gardenArea = Math.pow(gardenLength,2);
      pondArea = Math.PI * Math.pow(radiusPond, 2);
      lawnArea = gardenArea - pondArea;

      //print outputs for user
      System.out.println("The area of the garden is " + df.format(gardenArea) + "m²");
      System.out.println("The area of the pond is " + df.format(pondArea) + "m²");
      System.out.println("The area of the lawn is " + df.format(lawnArea) + "m²");

   }//main
}//class
