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

public class Rectangle extends Point
{
 protected int length;
 protected int width;

 public Rectangle (int l, int w, int x, int y)
 {
  super(x,y);
  length=l; 
  width=w;
 }

 public Rectangle (int l, int w)
 {
  super();
  length=l; 
  width=w;
 }

 public Rectangle ()
 {
  super();
  length=0; 
  width=0;
 }

 public int area() { return length*width; }

 public String getName() { return "Rectangle"; }
 public String getInfo() {
  return super.getInfo() + " length " + getLength()  + " width " + getWidth();}

 public int getWidth() { return width; }
 public int getLength() { return length; }

 public void setLength (int h) { length = h; }
 public void setWidth (int h)  { width = h; }
}
