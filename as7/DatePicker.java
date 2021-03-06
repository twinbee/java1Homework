// Matthew Bennett
// CSS 444 4-22-04
// Java assignment 7 - Date Picker Applet
// jdk 1.4
// This class is used along with Date.java
 // uses the Date Class from assignment 4
 // this applet is a swing interface to that class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DatePicker extends JApplet implements ActionListener
{
  private int currMonth=0;
  private int currYear=2004;  

public void actionPerformed (ActionEvent event) {
 if ("comboBoxChanged".equals(event.getActionCommand() )) {
  currMonth = wMonth.getSelectedIndex();
  fillTable();
 }

  currYear = Integer.parseInt(years[wYear.getSelectedIndex()]);
  fillTable();

  wTime = new JTextField(""	+ calendar.get(Calendar.HOUR) +      
                            ":" + calendar.get(Calendar.MINUTE));

 repaint();
} 

private void fillTable()
{ 
 for (int i=0;i<6;i++) for (int j=0; j<7; j++) calDataValues[i][j]="";
 calendar = new GregorianCalendar(currYear, currMonth, 1);
 int l=0;
 for (int k = calendar.get( Calendar.DAY_OF_WEEK )-1; k<=40; k++ )
 {
  if ( ( l >= DaysInMonth[currMonth] && !(currMonth==1) ) // non leapyear
   || ( currYear%4 == 0 && currMonth==1 && l >= DaysInMonth[currMonth]+1 ) //leap year
   ) break;
  calDataValues[k/7][k%7]=""+ ++l;
 }

}

  private String [] months =
   {"January", "February", "March", "April", "May", "June", "July",
    "August", "September", "October", "November", "December"};
  private String [] years =
   {"2000", "2001", "2002", "2003", "2004", "2005", "2006","2007",
    "2008", "2009", "2010"};

 private int DaysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

 private	String calColumnNames [] = { "S", "M", "T", "W", "T", "F", "S"};
 private	String calDataValues[][] = new String[6][7];

 private Container contentPane;
 private JPanel jpanel;
 private JComboBox 	wMonth;
 private JList 		wYear;
 private JTable		wCal;
 private JLabel 	wTimeLabel;
 private JTextField	wTime;

 private GregorianCalendar calendar = new GregorianCalendar();

 private Graphics g;

public void init()
{
 try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");}
 catch (Exception e) { }
 setSize(300,200);

 contentPane = getContentPane();
 jpanel = new JPanel();
 jpanel.setLayout (new FlowLayout() );

 wMonth = new JComboBox(months);
 wMonth.setSelectedIndex(0);
 wMonth.addActionListener(this);

 wYear = new JList(years);
 wYear.setVisibleRowCount(1);
 wYear.setSelectedIndex(0);

 JScrollPane scrollPane = new JScrollPane(wYear);
 
 wCal = new JTable(calDataValues, calColumnNames);
 wCal.setPreferredScrollableViewportSize(new Dimension(250, 100));
 wCal.setShowHorizontalLines( false );
 wCal.setShowVerticalLines( false );
 // wCal.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
 for (int i = 0; i < 7; i++) {
  wCal.getColumnModel().getColumn(i).setMinWidth(30); 
  wCal.getColumnModel().getColumn(i).setMaxWidth(40); }

 JScrollPane scrollPane2 = new JScrollPane(wCal);
 // scrollPane2.setSize(100, 100);

  wTime = new JTextField(""	+ calendar.get(Calendar.HOUR) +      
                            ":" + calendar.get(Calendar.MINUTE));
  wTime.setColumns(5);
  wTime.setHorizontalAlignment(JTextField.RIGHT);
	
 wTimeLabel = new JLabel("Current time: ");

 jpanel.add(wMonth);
 jpanel.add(scrollPane);
 jpanel.add(scrollPane2);
 jpanel.add(wTimeLabel);
 jpanel.add(wTime);	
 contentPane.add(jpanel);

 fillTable();
}

 public void paint()
 {
  super.paint(g);
  
 }

 public void start()
 {

 }
}
