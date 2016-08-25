// Matthew Bennett
// CSS 444 3-22-04
// Java assignment 7 - Date class
// jdk 1.4
// This class is used along with DateTest.cpp
 // to store, output, and calculate "age" of dates
 //it includes sanity checking and uses java.util.GregorianCalender
import java.text.*;
import java.util.*;
//import javax.swing.*;

public class Date1
{
 private Date iDate;
 private SimpleDateFormat iFormat;

 public Date1(int y, int m, int d)
 {
  int [] yy = new int[1];
  int [] mm = new int[1];
  int [] dd = new int[1];
 
  yy[0]=y;
  mm[0]=m;
  dd[0]=d;
 
  sanityCheck(yy,mm,dd);

  iFormat = new SimpleDateFormat("EEEEEEEE, MMMMMMMM dd, yyyy");
  GregorianCalendar iCal = new GregorianCalendar(yy[0], mm[0]-1, dd[0]);
  iDate = iCal.getTime();
 }

 public void sanityCheck(int y[], int m[], int d[])
 {
/*
  while ((d[0] < 1) || (d[0] > 365))  d[0] = Integer.parseInt(JOptionPane.showInputDialog("Re-enter day"));
  while ((m[0] < 1) || (m[0] > 12))   m[0] = Integer.parseInt(JOptionPane.showInputDialog("Re-enter month"));
  while ((y[0] < 0) || (y[0] > 4000)) y[0] = Integer.parseInt(JOptionPane.showInputDialog("Re-enter year"));
*/
 }

 public Date1() { this(0, 0, 0); }

 public void set(int y, int m, int d)
 {
  int [] yy = new int[1];
  int [] mm = new int[1];
  int [] dd = new int[1];
                                                                                                                                                             
  yy[0]=y;
  mm[0]=m;
  dd[0]=d;
                                                                                                                                                             
  sanityCheck(yy,mm,dd);
                                                                                                                                                             
  GregorianCalendar iCal = new GregorianCalendar(yy[0], mm[0]-1, dd[0]);
  iDate = iCal.getTime();
 }

 public String longFormat()
 {
  return iFormat.format(iDate);
 }

 public String age()
 {
  GregorianCalendar someDate = (GregorianCalendar) Calendar.getInstance();
  someDate.setTime( iDate );
  GregorianCalendar now = (GregorianCalendar) Calendar.getInstance();

  int years = now.get( Calendar.YEAR ) - someDate.get( Calendar.YEAR )-1;
  int months =
    now.get( Calendar.MONTH ) > someDate.get( Calendar.MONTH ) ?
    now.get( Calendar.MONTH ) - someDate.get( Calendar.MONTH ) :
    someDate.get( Calendar.MONTH ) - now.get( Calendar.MONTH ) ;
//  months-=years*12;
  int weeks =
    now.get( Calendar.WEEK_OF_MONTH ) > someDate.get( Calendar.WEEK_OF_MONTH ) ?
    now.get( Calendar.WEEK_OF_MONTH ) - someDate.get( Calendar.WEEK_OF_MONTH ) :
    someDate.get( Calendar.WEEK_OF_MONTH ) - now.get( Calendar.WEEK_OF_MONTH ) ;
// weeks -= months*4;
  int days =
    now.get( Calendar.DAY_OF_MONTH ) > someDate.get( Calendar.DAY_OF_MONTH ) ?
    now.get( Calendar.DAY_OF_MONTH ) - someDate.get( Calendar.DAY_OF_MONTH ) :
    someDate.get( Calendar.DAY_OF_MONTH ) - now.get( Calendar.DAY_OF_MONTH ) ;

  return "" 
   + years 	+ " years, "
   + months 	+ " months, "
   + weeks 	+ " weeks, "
   + days	+ " days, "
   ;
 }
}
