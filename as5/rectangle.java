// Author:      Matt Bennett
// Program: Assignment #5
// CSC 444 Dr. Zhang
// Date: 4-4-4
// Environment: javac 1.4.2 J2DK J2SE

// Description: provides base functionality for rectangularSolid
//  Inheritance assignment
public class rectangle
{
 protected int length;
 protected int width;

 public rectangle (int l, int w)
 {
  length=l; 
  width=w;
 }

 public rectangle ()
 {
  length=0; 
  width=0;
 }

 public int getArea() { return length*width; }
 public int getWidth() { return width; }
 public int getLength() { return length; }
 public String getName() { return "rectangle"; }

 public void setLength (int h) { length = h; }
 public void setWidth (int h) { width = h; }
}
