/******************************************
 * Lab 2 Advanced Programming
 * Question 4
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonTwoPanel extends JPanel implements ActionListener {
	private JButton blueButton;
	private JButton yellowButton;
	private int countBlue;
	private int countYellow;
	private JTextArea myArea;
	
	public ButtonTwoPanel(){
		//Creating buttons
		blueButton = new JButton("blue");
		yellowButton = new JButton("yellow");
		//Creating TextArea for results
		myArea = new JTextArea("No buttons have been clicked, YET",15,23);
		
		//Setting FlowLayout and adding properties for the panel
		setLayout(new FlowLayout());
		add(blueButton);
		add(yellowButton);
		add(myArea);
		setBackground(Color.MAGENTA);
		setPreferredSize(new Dimension(300,300));
		//Setting button properties
		blueButton.setBackground(Color.blue);
		blueButton.setOpaque(true);
		blueButton.setBorderPainted(false);
		yellowButton.setBackground(Color.yellow);
		yellowButton.setOpaque(true);
		yellowButton.setBorderPainted(false);
		blueButton.addActionListener(this);
		yellowButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Action if blue button is pressed.
		if(e.getSource() == blueButton){
			countBlue ++;
		}
		//Action if yellow button is pressed.
		else if (e.getSource() == yellowButton){
			countYellow++;
		}
		myArea.setText("You have clicked the blue button " + countBlue + " times" + "\n" + "You have clicked the yellow button " + countYellow + " times");
	}
}
