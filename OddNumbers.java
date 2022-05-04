package Lab6;
import java.util.Scanner;
/**
 * File Name: OddNumbers
 * Created by John Nixon on 08/10/2021
 * Program to print out all the odd numbers between 1 and 50. Program will also calculate and print the total
 * and average of the printed numbers at the end
 **/
public class OddNumbers
{

   public static void main(String[] args)
   {
      int count, total = 0, average = 0;

      for (count = 1; count <= 50; count +=2)
      {
         System.out.println("Number " + count);
         total = total + count;
         average = total/25;
      }

      System.out.println("Total of numbers: " + total);
      System.out.println("Average of numbers: " + average);




   }//main
}//class
