package Lab8;

import java.util.Scanner;

/**
 * File Name: EmployeeSales
 * Created by John Nixon on 28/10/2021
 * Program to read employee name, their cash sales and card sales performances as a percentage,
 * and calculate their overall sales and print level awarded
 **/
public class EmployeeSales
{
   static Scanner keyboard = new Scanner(System.in);

   static String employeeName;

   //method to read employee name
   public static String enterName()
   {
      System.out.println("Please enter your name: ");
      employeeName = keyboard.next();
      return employeeName;
   }//enterName

   public static double enterValue(String saleType)
   {
      System.out.println("Please confirm the " + saleType + " value: ");
      return keyboard.nextDouble();

   }//enterValue

   //method to check value of sale
   public static boolean checkValue(double value)
   {
      return ((value >= 0) && (value <= 100));
   }//checkValue

   //method to calculate and return the overall value
   public static double calculateValue (double cashSales, double cardSales)
   {
      return Math.round((cashSales + cardSales) / 2);
   }//calculateValue

   //method to assign and return the overall level
   public static String assignLevel (double cashSales, double cardSales, double finalLevel)
   {
      final int STEADY = 40;
      final int OUTSTANDING = 70;

      if ((cashSales < STEADY) || (cardSales < STEADY))
      {
         return "Under Performing";
      }//if
      else
      {
         if(finalLevel < OUTSTANDING)
         {
            return "Steady";
         }//if
         else
            {
               return "Outstanding";
            }//else
      }//else
   }//assignLevel

   //method to output results
   public static void outputResults(String pname, double pcashSales, double pcardSales,
                                    double pfinalLevel)
   {
      System.out.println("Name \t\t\t\tCash Sales \t\t Card Sales \t\tOverall\t\tSales Level");
      System.out.println(pname + "\t\t\t\t" + (int) pcashSales + "\t\t\t\t" + (int) pcardSales
            + "\t\t\t\t\t" + (int) pfinalLevel + "\t\t\t"
            + assignLevel(pcashSales, pcardSales, pfinalLevel));
   }//outputResults

   public static void main(String[] args)
   {
      String name;
      double cashSales, cardSales, finalLevel;
      boolean cashSalesValueOK, cardSalesValueOK;

      name = enterName();
      cashSales = enterValue("cash sales");
      cashSalesValueOK = checkValue(cashSales);
      if (cashSalesValueOK)
      {
         cardSales = enterValue("card sales");
         cardSalesValueOK = checkValue(cardSales);
         if (cardSalesValueOK)
         {
            finalLevel = calculateValue(cashSales, cardSales);
            outputResults(name, cashSales, cardSales, finalLevel);
         }//if
         else
            {
               System.out.println("Cash sales value out of range");
            }//else
      }//if
      else
         {
            System.out.println("Card sales value out of range");
         }//else

   }//main
}//class
