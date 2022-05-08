package Lab7;
import java.util.Scanner;
import java.lang.*;
/**
 * File Name: Dice
 * Created by John Nixon on 17/10/2021
 * Program to simulate rolling of two dice (using Math.random()) and to print resulting number until the user
 * wishes to stop
 **/
public class Dice
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      //declare variables
      int dice1, dice2, diceTotal;
      char yesOrNo;

      do
      {
         dice1 = (int) (Math.random() * 6) + 1;
         dice2 = (int) (Math.random() * 6) + 1;

         diceTotal = dice1 + dice2;

         System.out.println("Dice 1 rolled number " + dice1 + ", dice 2 rolled number " + dice2
                        + ", and the total number is " + diceTotal);
         System.out.println("Do you want to continue (Y/N)? ");
         yesOrNo = keyboard.nextLine().toUpperCase().charAt(0);
      }while (yesOrNo == 'Y');//continue while response is Y/y

   }//main
}//class
