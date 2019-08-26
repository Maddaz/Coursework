/******************************************
 * Lab 2 Advanced Programming
 * Question 6
 * Author: Mateusz Glogowski s4546642  
 ******************************************/

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class MouseDetectorPanel extends JPanel implements MouseListener
{
   private final int SIZE = 6;  // diameter of dot

   private int x = 500, y = 500;  // coordinates of mouse press


   public MouseDetectorPanel()
   {
      addMouseListener (this);

      setBackground (Color.white);
      setPreferredSize (new Dimension(400, 200));
   }

   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      page.setColor (Color.black);

      page.fillOval (x, y, SIZE, SIZE);
      page.drawLine(200, 0, 200, 400);
    
   }

      public void mousePressed (MouseEvent event)
      {
    	  //changing background colour dependant on location of mouse click
    	  if(event.getX() <= 200){
	        	super.setBackground(Color.YELLOW);
	        	
	        } else if(event.getX() > 200){
	        	super.setBackground(Color.GREEN);
	        } 
    	  //painting spot of click
         x = event.getX();
         y = event.getY();
         repaint();
      }
      
      // provide empty definitions for unused event methods
      public void mouseClicked (MouseEvent event) {}
      public void mouseReleased (MouseEvent event) {}
      public void mouseEntered (MouseEvent event) {}
      public void mouseExited (MouseEvent event) {}
      
  }