// Author:      Matt Bennett
// Program: Assignment #2
// CSC 444 Dr. Zhang
// Date:
// Environment: javac 1.4.2 J2DK J2SE
// Description: Draws a shape using astericks depending upon what number input
//  1) for a 1 it draws a rectangle
//  2) for a 2 it draws a triangle
//  3) for a 3 it draws a diamond
// with the dimensions given to it
import java.awt.Graphics;
import javax.swing.*;

public class as2 extends java.applet.Applet {
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */   
    int height=9, width=9, shapeID=0;
    
    public void init() {
        String temp1;
        
        do {
            temp1 = JOptionPane.showInputDialog("Enter Code for Shape Type: " );
            shapeID = Integer.parseInt(temp1);
            if (!(shapeID==1 || shapeID==2 || shapeID==3))
            JOptionPane.showMessageDialog( null, "Shape code must be 1, 2, or 3",
             "Error", JOptionPane.PLAIN_MESSAGE);
            else break;
        } while (true);
       /*     
        temp1 = JOptionPane.showInputDialog("Enter Height: " );
        height = Integer.parseInt(temp1);
        temp1 = JOptionPane.showInputDialog("Enter Width: " );
        width = Integer.parseInt(temp1);
       */
    } //end init()

    public void paint (Graphics g) {
        super.paint(g);
        
        //handles rectagle
        if (shapeID==1)
        for (int i=1; i<=height; i++)
        for (int j=1; j<=width; j++)
        g.drawString("*", 25+15*j, 25+15*i);
        //handles triangle
        else if (shapeID==2)
        for (int i=1; i<=height; i++)
        for (int j=0; j<=width-i; j++)
        g.drawString("*", 25+15*j+15*i/2, 25+15*i);
        //handles diamond
        else if (shapeID==3)
        {
         for (int i=height; i>=1; i--)
         for (int j=0; j<=width/2-i; j++)
         g.drawString("*", 25+15*j+15*i/2, 105-15*i);
         
         for (int i=0; i<=height; i++)
         for (int j=0; j<=width/2-i; j++)
         g.drawString("*", 25+15*j+15*i/2, 40+15*i+15*width/2);
         
        }
        
    } //end paint()
}
