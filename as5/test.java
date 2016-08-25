// Author:      Matt Bennett
// Program: Assignment #1
// CSC 444 Dr. Zhang
// Date:
// Environment: javac 1.4.2 J2DK J2SE

// Description: tests objects from both rectangle and
//  rectangularSolid(->rectangle) classes.

public class test
{
 public static void main (String args[])
 {
  rectangle myRec 			=	new rectangle(1, 2);
  rectangularSolid mySol=	new rectangularSolid(1, 2, 10);
  
  System.out.println("MyRec.width: "  + myRec.getWidth() );
  System.out.println("MyRec.length: " + myRec.getLength());
  System.out.println("MyRec.Area: "   + myRec.getArea()  );
  System.out.println();
  System.out.println("MySol.width: "  + mySol.getWidth() );
  System.out.println("MySol.length: " + mySol.getLength());
  System.out.println("MySol.height: " + mySol.getHeight());
  System.out.println("MySol.Area: "   + mySol.getArea()  );
  System.out.println("MySol.Volume: " + mySol.getVolume()  );
 }

}
