// Author:      Matt Bennett
// Program: Assignment #1
// CSC 444 Dr. Zhang
// Date:
// Environment: javac 1.4.2 J2DK J2SE
// Description: Fetches two strings using swing dialog boxes.
//  Then searches the first string for instances of the second and displays
//  in a dialog box the number of substring instances counted.

import javax.swing.*;

public class as1 {
	public static void main (String args[] ) {
		String theText; //text in which to search
		String pattern; //thing to look for

		int result = 0; //counts number of substring matches
                                              
		theText = JOptionPane.showInputDialog("Enter String in which to search: " );
		pattern = JOptionPane.showInputDialog("Enter String to search for: " );

                for (int i=0; i<=theText.length(); i++) if (theText.regionMatches(true, i, pattern, 0, pattern.length() )) result++;
                
		JOptionPane.showMessageDialog( null, "The number of occurances is " + result, "Results", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
	} //end main
} //end class Assignment1
