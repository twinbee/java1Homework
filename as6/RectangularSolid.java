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
public class RectangularSolid extends Rectangle
{
 protected int z,height;
 
 public RectangularSolid (int l, int w, int h, int x, int y, int Z)
 {
  super(l, w, x, y);
  height=h;
  z = Z;
 }

 public RectangularSolid (int l, int w, int h)
 {
  super(l, w);
  height=h;
 }

 public RectangularSolid ()
 {
  super();
  height=0;
  z=0;
 }

 public int getVolume() { return length*width*height; }

 public String getName() { return "RectanglularSolid"; }

 public String getInfo() {
  return super.getInfo() + " Z " + z + " Height " + height; }

 public int getHeight() { return height; }

 public void setHeight(int h) { height=h; }

}
