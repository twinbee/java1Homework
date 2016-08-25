import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Annoyance extends JFrame implements MouseListener, MouseMotionListener {
 private JButton button;
 private Icon buttonIcon, lifeIcon;
 private Random random = new Random(55555);
 private boolean caught;

 private class ButtonHandler implements ActionListener {
  public void actionPerformed (ActionEvent event)
  {
   caught=true;
   button.setIcon(lifeIcon);
   button.setText("Congratulations!");
  }
 }

 public void mouseClicked(MouseEvent event) {
  //if (!caught) button.setLocation(random.nextInt(500), random.nextInt(250));
 }

 public void mousePressed(MouseEvent event) {
  if (!caught) button.setLocation(random.nextInt(500), random.nextInt(250));
 } 

 public void mouseReleased(MouseEvent event) {
  //if (!caught) button.setLocation(random.nextInt(500), random.nextInt(250));  
 } 

 public void mouseEntered(MouseEvent event) {
  //if (!caught) button.setLocation(random.nextInt(500), random.nextInt(250));    
 } 

 public void mouseExited(MouseEvent event) {
  //if (!caught) button.setLocation(random.nextInt(500), random.nextInt(250));    
 } 

 public void mouseDragged(MouseEvent event) {
  if (caught) button.setLocation(event.getX(), event.getY());
 } 

 public void mouseMoved(MouseEvent event) {
  if (!caught) button.setLocation(random.nextInt(500), random.nextInt(250));    
 } 

 public Annoyance () {
   //calls the constructor of JFrame parent with title bar arg
  super( "Annoyance--Java Assignment 8");

  //get container pane and set its layout
  Container container = getContentPane();
  container.setLayout(new FlowLayout() );

  buttonIcon = new ImageIcon("death.png");
  lifeIcon = new ImageIcon("life.gif");

  button = new JButton("Click me!", buttonIcon);
  container.add(button);

  ButtonHandler handler = new ButtonHandler();
  button.addActionListener(handler);

  addMouseListener(this);
  addMouseMotionListener(this);
  
  setSize(600, 300);
  setVisible(true);

  caught=false;
 }

 public static void main(String args[]) {
  Annoyance app = new Annoyance();
  app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


}
