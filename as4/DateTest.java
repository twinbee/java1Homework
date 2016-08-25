// Matthew Bennett
// CSS 444 3-22-04
// Java assignment 4 - Date class due mar 31
// jdk 1.4
// This class is used along with Date1.cpp
 // to store, output, and calculate "age" of dates
 //it includes sanity checking and uses java.util.GregorianCalender

import javax.swing.*;
import java.util.Random;

public class DateTest
{
 public static void main(String args[])
 {
  int day  = Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
  int mon  = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
  int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));

  Date1 myDate = new Date1 (year, mon, day);
  
  JOptionPane.showMessageDialog(null, "The birthday is " + myDate.longFormat() );
  JOptionPane.showMessageDialog(null, "The amount of time since this date (age) is " + myDate.age() );

  Random generator = new Random( 19580427 );
  myDate.set(1950-generator.nextInt(30), generator.nextInt(11)+1, generator.nextInt(364)+1);
  JOptionPane.showMessageDialog(null, "The amount of time left in this person's life is: " + myDate.age() );
 
  System.exit(0);  
 }
}
