package Lab3;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * File Name: Investment
 * Created by John Nixon on 30/09/2021
 * Program prompts the user to enter how much money he wants to invest and how many years he wants to invest
 * the money for. Program should calculate the return at 5% simple interest and output the value of investment
 * at the end of the investment period.
 **/
public class Investment
{

   public static void main(String[] args)
   {
      DecimalFormat df = new DecimalFormat("#0.00");
      Scanner keyboard = new Scanner(System.in);

      double investment, finalValue;
      int years;
      final double INTERESTRATE = 0.035;

      System.out.println("Please enter initial investment: ");//prompt to user for amount
      investment = keyboard.nextDouble ();
      System.out.println("Please enter investment period: ");// prompt to user for period
      years = keyboard.nextInt();

      finalValue = investment + (investment * years * INTERESTRATE); // calculate value of investment

      //output results
      System.out.println("Initial Investment:                  £" + df.format(investment));
      System.out.println("Investment Period:                   "  + years + " years");
      System.out.println("Final value of Investment (at 5.00%) £" + finalValue);

   }//main
}//class
