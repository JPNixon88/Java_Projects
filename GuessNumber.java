package Lab7;
import java.util.Scanner;
/**
 * File Name: GuessNumber
 * Created by John Nixon on 11/10/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class GuessNumber
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      final int GUESSNUMBER = 43, LOWERLIMIT = 1, UPPERLIMIT = 50;
      int userGuess;

      do
      {
         System.out.println("Please enter your guess between: " + LOWERLIMIT + " and "
         + UPPERLIMIT);
         userGuess = keyboard.nextInt();

         if (userGuess != GUESSNUMBER)
            System.out.println("Sorry incorrect guess");
      } while (userGuess != GUESSNUMBER || (userGuess <= UPPERLIMIT && userGuess >= LOWERLIMIT));

      if (userGuess == GUESSNUMBER)
         System.out.println("Congratulations you guessed correctly");
      else
         System.out.println("Your guess is out of range");

   }//main
}//class
