package Lab6;
import java.text.DecimalFormat;
/**
 * File Name: KilosTo Pounds
 * Created by John Nixon on 08/10/2021
 * Program prints out a table of kilograms from 5 to 100 (in increments of 5) and their equivalent pounds
 **/
public class KilosToPounds
{

   public static void main(String[] args)
   {
      //set decimal format as 0.0
      DecimalFormat df = new DecimalFormat("#0.0");

      //set variables for count and pounds
      int count;
      double pounds;

      //for loop to loop from 5 to 100 in intervals of 5
      for (count = 5 ;count <= 100; count +=5)
      {
         //calculation for kilograms into pounds
         pounds = count * 2.20;
         //output to user
         System.out.println("\tKilograms" + "\t\tPounds\n"
                           + "\t" + count + "\t\t\t\t" + df.format(pounds));
      }//for

   }//main
}//class
