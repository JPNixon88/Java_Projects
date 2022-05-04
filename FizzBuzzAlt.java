package Lab5;
import java.util.Scanner;
/**
 * File Name: FizzBuzz
 * Created by John Nixon on 11/10/2021
 * Program to read an integer from the keyboard and output
 *    FIZZ if evenly divisible by 3
 *    BUZZ if evenly divisible by 7
 *    otherwise output the number
 **/
public class FizzBuzzAlt
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //Declare variables
      int number;

      System.out.println("Enter an integer: ");
      number = keyboard.nextInt();

      //check if number is evenly divisible by 3 and/or 7 and output results
      if ((number % 3 == 0) || (number % 7 == 0))
      {
         if (number % 3 == 0)
         {
            System.out.println("FIZZ");
         }//if
         if (number % 7 == 0)
         {
            System.out.println("BUZZ");
         }//if
      }//if
      else
      {
         System.out.println(number);
      }

   }//main
}//class
