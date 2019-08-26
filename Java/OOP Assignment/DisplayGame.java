//**********************************************************
// Programming Assignment
// NBIT Object Oriented Programming NIT2112
// Mateusz Glogowski - s4546642
// Brendan Aked - s4546608
// 
//
// DisplayGame.java
// DisplayGame class to create the gui
//
//**********************************************************
import javax.swing.*;

public class DisplayGame
{
   public static void main(String[]args)
   {
      JFrame w1 = new JFrame("Suitcases and Player Game");
      
      GamePanel myGamePanel = new GamePanel();
      w1.add (myGamePanel);
      
      w1.setSize(290, 300);
      
      w1.setVisible(true);
      
      w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }//end main
}//end class