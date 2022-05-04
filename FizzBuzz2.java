package Lab6;
import java.util.Scanner;
/**
 * File Name: FizzBuzz2
 * Created by John Nixon on 14/10/2021
 * Program to prompt user to input 2 integers from the keyboard representing start number and finish
 * number. Program then outputs the following based on below rules:
 * 1) number evenly divisible by 3 - FIZZ
 * 2) number evenly divisible by 7 - BUZZ
 * 3) number evenly divisible by 3 and 7 - FIZZBUZZ
 * 4) all other cases print number itself
 **/
public class FizzBuzz2
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //declare variables
      int startNumber, finishNumber, count;

      //prompt user for input
      System.out.println("Please enter start number: ");
      startNumber = keyboard.nextInt();
      System.out.println("Please enter finish number: ");
      finishNumber = keyboard.nextInt();
      //print space for formatting reasons
      System.out.print("\n");

      //for statement setting count to start at start number, finish at finish number, and count by 1
      for (count = startNumber; count <= finishNumber; count ++)
      {
         //if statement to print FIZZBUZZ if number divisible by 3 and 7
         if ((count % 3 == 0) && (count % 7 == 0))
         {
            System.out.println("FIZZBUZZ");
         }//if

         //if statement block to print FIZZ for divisible by 3 and BUZZ for divisible by 7
         else if ((count % 3 == 0) || (count % 7 == 0))
         {
            if (count % 3 == 0)
               System.out.println("FIZZ");

            if (count % 7 == 0)
               System.out.println("BUZZ");
         }//if

         //else statement to print number when not divisible evenly by 3 or 7
         else
         {
            System.out.println(count);
         }//else
      }//for

   }//main
}//class
