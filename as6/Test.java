// Author:      Matt Bennett
// Author 2:	  Laura Pay

// file: shape.java
// Program: Assignment #6 - inheritance and olymorphism
// CSC 444 Dr. Zhang
// Date: 4-15-04
// Environment: javac 1.4.2 J2DK J2SE

// Description: practice with interfaces, inheritance, and polymorphism

//  interface shape contains : int area(), int volume(), and getName
//  class Point implements shape (all methods) and includes coordinates
//  class rectangle extends Point,inherits volume(), provides area(), int l, w
//  class rectangularSolid extends rectangle, overrides area(), volume()
//   provides int z
//   ** all classes implement getName()
//
//  class Test insures that the polymorphism is working the expected way

import javax.swing.*;

public class Test
{
 public static void main(String args[])
 {
  Point point = new Point(1,2);
  Rectangle rectangle = new Rectangle(10,10,10,10);
  RectangularSolid solid = new RectangularSolid(2,5,8,13,21,34);
  Shape arrayOfShapes[] = { point, rectangle, solid };

  for (int i=0; i<3; i++)
	JOptionPane.showMessageDialog(
   null,
   arrayOfShapes[i].getInfo(),
   "Results: "+arrayOfShapes[i].getName(),
   JOptionPane.PLAIN_MESSAGE);

 System.exit(0);  
 }
}
