/******************************************
 * Lab 2 Advanced Programming
 * Question 5
 * Author: Mateusz Glogowski s4546642  
 ******************************************/


import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;

public class Question5Frame
  {
  public static void main(String [] args)
  {  JFrame myFrame = new JFrame("Lab 3: Question 5") ;

    // create an instance of Question5Panel and add to frame
      Question5Panel myPanel = new Question5Panel( ) ;
      myFrame.add (myPanel );

    // set up functionality of frame
     myFrame.setSize(500, 350 );
     myFrame.setVisible(true);
     myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
   
  }//end main
} // end class
