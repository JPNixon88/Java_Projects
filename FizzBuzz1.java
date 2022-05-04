package Lab5;
import java.util.Scanner;
/**
 * File Name: FizzBuzz1
 * Created by John Nixon on 10/10/2021
 * Program reads an integer from the keyboard and outputs information according to following rules:
 * 1) number is evenly divisible by 3 - print FIZZ
 * 2) number is evenly divisible by 7 - print BUZZ
 * 3) in all other cases - print the number itself
 * If the number is divisible by 3 and 7, print FIZZBUZZ
 **/
public class FizzBuzz1
{

   public static void main(String[] args)
   {
      //set scanner
      Scanner keyboard = new Scanner(System.in);

      //set variables and values
      int number;
      final int THIRD = 3, SEVENTH = 7;

      //prompt user for input
      System.out.println("Enter a number :");
      number = keyboard.nextInt();

      //first if statement to cover if number divisible by both 3 and 7
      if ((number % THIRD == 0) && (number % SEVENTH == 0))

      {
         System.out.println("FIZZBUZZ");
      }//if

      //else if statements for when one rule is met
      else if (number % THIRD == 0)
      {
         System.out.println("FIZZ");
      }// else if

      else if (number % SEVENTH == 0)
      {
         System.out.println("BUZZ");
      }//else if

      //else statement to cover the number not being divisible by 3 or 7
      else
      {
         System.out.println(number);
      }//else
   }//main
}//class
