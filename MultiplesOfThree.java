package Lab7;

import java.util.Scanner;

/**
 * File Name: MultiplesOfThree
 * Created by John Nixon on 21/10/2021
 * Program to read user input of number and print output if the number is a multiple of 3
 **/
public class MultiplesOfThree
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      final int TERMINATOR = -999;
      int number, noOfMultiples = 0, count = 0;

      System.out.println("Enter the first number: ");
      number = keyboard.nextInt();

      while (number != TERMINATOR)
      {
         if (number % 3 == 0)
         {
            System.out.println(number + " is a multiple of 3");
            noOfMultiples = noOfMultiples + 1;
         }//if
         else
            {
               System.out.println(number + " is not a multiple of 3");
            }//else
         count = count + 1;

         System.out.println("Enter a number (or -999 to finish): ");
         number = keyboard.nextInt();
      }//while

      System.out.println(count + " numbers where entered");
      System.out.println(noOfMultiples + " were mutiples of 3");

   }//main
}//class
