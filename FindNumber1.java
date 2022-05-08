package Lab7;
import java.util.Scanner;
import java.lang.*;
/**
 * File Name: FindNumber1
 * Created by John Nixon on 17/10/2021
 * Program to find set number from random number generation
 **/
public class FindNumber1
{

   public static void main(String[] args)
   {
      final int SEARCHNUMBER = 5;
      int number = 0;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Looking for number 5");

      do
      {
         number = (int) (Math.random() * 10); // get a random number
         System.out.println("The number is " + number);
      }
      while (number != SEARCHNUMBER);

      System.out.println("Found search number - " +  number);

   }//main
}//class
