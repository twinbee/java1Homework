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
public class Point implements Shape
{
 protected int x;
 protected int y;

 public Point (int X, int Y)
 {
  x=X; 
  y=Y;
 }

 public Point()
 {
  x=0; 
  y=0;
 }

 public int area()   { return 0; }
 public int volume() { return 0; }

 public String getName() { return "Point"; }

 public String getInfo()
 { return getName() + ": x " + x + " y " + y
    + " area " + area() + " volume " + volume() ; }
}
