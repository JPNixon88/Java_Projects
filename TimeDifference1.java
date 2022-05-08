package Lab8;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * File Name: TimeDifference1
 * Created by John Nixon on 18/10/2021
 * Program to read in start time and finish time (24 hour clock), and output time difference in hours,
 * minutes, and seconds
 **/
public class TimeDifference1
{
   static final int SECMINHOUR = 60, DAYHOURS = 24;
   static int startHour, endHour, hour;
   static int startMinute, endMinute, minutes;
   static int startSecond, endSecond, seconds;

   public static void readData ()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What is the start time (24-hour clock):");
      System.out.println("Hour: ");
      startHour = keyboard.nextInt();
      System.out.println("Minutes: ");
      startMinute = keyboard.nextInt();
      System.out.println("Seconds: ");
      startSecond = keyboard.nextInt();

      System.out.println("What is the finish time (24-hour clock):");
      System.out.println("Hour: ");
      endHour = keyboard.nextInt();
      System.out.println("Minutes: ");
      endMinute = keyboard.nextInt();
      System.out.println("Seconds: ");
      endSecond = keyboard.nextInt();

      System.out.print("\n");

   }//readData

   public static void calculateDifference()
   {
      seconds = endSecond - startSecond;
      minutes = endMinute - startMinute;
      hour = endHour - startHour;

      if (seconds < 0)
      {
         seconds = seconds + SECMINHOUR;
         minutes = minutes - 1;
      }//if

      if (minutes < 0)
      {
         minutes = minutes +  SECMINHOUR;
         hour = hour - 1;
      }//if

      if (hour < 0)
      {
         hour = hour + DAYHOURS;
      }//if

   }//calculateDifference

   public static void outputResults()
   {
      DecimalFormat df = new DecimalFormat("00");
      System.out.println("Start Time:\t\t" + df.format(startHour) + ":" + df.format(startMinute) + ":"
            + df.format(startSecond));
      System.out.println("Finish Time:\t\t" + df.format(endHour) + ":" + df.format(endMinute) + ":"
            + df.format(endSecond));
      System.out.println("Time Difference:\t" + df.format(hour) + ":" + df.format(minutes) + ":"
            + df.format(seconds));
   }//outputResults

   public static void main(String[] args)
   {
      readData();
      calculateDifference();
      outputResults();

   }//main
}//class
