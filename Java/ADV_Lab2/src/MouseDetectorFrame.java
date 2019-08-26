/******************************************
 * Lab 2 Advanced Programming
 * Question 6
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import javax.swing.*;

public class MouseDetectorFrame
{
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Coordinates");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.getContentPane().add(new MouseDetectorPanel());
      
      frame.pack();
      frame.setVisible(true);
   
   }
}
