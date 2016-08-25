// Author:      Matt Bennett
// Program: Assignment #5
// CSC 444 Dr. Zhang
// Date: 4-4-4
// Environment: javac 1.4.2 J2DK J2SE

// Description: inherits from rectangularSolid
//  Inheritance assignment
public class rectangularSolid extends rectangle
{
 private int height;

 public rectangularSolid (int len, int wid, int h)
 {
  height=h; 
  length=len;
  width=wid;
 }

 public int getVolume() { return getArea()*height; }
 public int getHeight() { return height; }
 public String getName() { return "rectangularSolid"; }

 public void setHeight(int h) { height = h; }

}
