package Lab5;
import java.util.Scanner;
/**
 *  File Name: GuessNumber
 * Created by John Nixon on 05/10/2021
 * Program prompts user to enter a number via keyboard, the user's guess is compared against a pre-set value,
 * and the user is then informed if the guess is correct or not
 **/
public class GuessNumber
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);

      int number;// set variable
      final int PRESETVALUE = 10;// set constant as 10

      System.out.println("Please enter your guess number:");// prompt user for number
      number = keyboard.nextInt();

      if (number == PRESETVALUE) //if statement for if user selects 10, prints success statement
      {
         System.out.println("Congratulations you have guessed correctly");
      }//if

      else //if statement for user guesses incorrectly, prints failure statement
      {
         System.out.println("Sorry, you have guessed incorrectly");
      }//else

   }//main
}//class
