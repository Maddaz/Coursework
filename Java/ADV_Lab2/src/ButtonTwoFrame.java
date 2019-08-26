/******************************************
 * Lab 2 Advanced Programming
 * Question 4
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonTwoFrame {

	public static void main(String[] args) {
		//Creating JFrame for display
		JFrame myFrame = new JFrame("Frame with 2 Buttons");
		//Creating and adding a panel
		ButtonTwoPanel myPanel = new ButtonTwoPanel();
		myFrame.add(myPanel);
		
		myFrame.pack();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
