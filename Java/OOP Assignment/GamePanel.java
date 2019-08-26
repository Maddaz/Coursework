//**********************************************************
// Programming Assignment
// NBIT Object Oriented Programming NIT2112
// Mateusz Glogowski - s4546642
// Brendan Aked - s4546608
// 
//
// GamePanel.java
// Contains the gui setup and main logic behind the game
//
//**********************************************************
import javax.swing.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener
{
   private JLabel label;
   private JButton suitcase1, suitcase2, suitcase3;
   private JTextArea results;
   
   public GamePanel()
   {
      label = new JLabel("Click any suitcase to commence play");
      suitcase1 = new JButton("Suitcase1");
      suitcase2 = new JButton("Suitcase2");
      suitcase3 = new JButton("Suitcase3");
      results = new JTextArea(8, 23);
      suitcase1.setActionCommand("1");
      suitcase2.setActionCommand("2");
      suitcase3.setActionCommand("3");
      suitcase1.addActionListener(this);
      suitcase2.addActionListener(this);
      suitcase3.addActionListener(this);
      add(suitcase1);
      add(suitcase2);
      add(suitcase3);
      add(label);
      add(results);
      
      results.setEditable(false);

      
   }
   public void actionPerformed(ActionEvent e)
   {
	   	Suitcase case1 = new Suitcase(0);
		Suitcase case2 = new Suitcase(0);
		Suitcase case3 = new Suitcase(0);
		Player player = new Player(0);
		int total = 0;
		
	   /*Based on value passed through button, different states of the game are run
	    *e.g if suitcase one is selected StartGame(1,case1,case2,case3,player) runs, with the 1 being the suitcase the
	    *Player has chosen. Screen is wiped every time the player selects a new button, this starts
	    *another round, generating new random ints and populating the cases*/
	   if("1".equals(e.getActionCommand())){
		   results.setText("");
		   StartGame game = new StartGame(1,case1,case2,case3,player);
		   player.setSuitcaseNum(1);
	   }
	   else if("2".equals(e.getActionCommand())){
		   results.setText("");
		   StartGame game = new StartGame(2,case1,case2,case3,player);
		   player.setSuitcaseNum(2);
	   }
	   if("3".equals(e.getActionCommand())){
		   results.setText("");
		   StartGame game = new StartGame(3,case1,case2,case3,player);
		   player.setSuitcaseNum(3);
	   }
	 //Printing Results of game.
		String toScreen = results.getText();
		toScreen +="Player has chosen suitcase: " + player.getSuitcaseNum() + " with value " + player.getSuitcaseValue() + '\n' +
					"Bank has:-";
		results.setText(toScreen);
		/*Printing banks case labels, determined by comparing each case label
		to the players selectedCase, also adding the total of the bank cases*/
		if(case1.getLabel() != player.getSuitcaseNum()){
			String toScreenC1 = results.getText();
			toScreenC1 += '\n' + case1.toString();
			results.setText(toScreenC1);
			total += case1.getAmount();
		}
		if(case2.getLabel() != player.getSuitcaseNum()){
			String toScreenC2 = results.getText();
			toScreenC2 += '\n' + case2.toString();
			results.setText(toScreenC2);
			total += case2.getAmount();
		}
		if(case3.getLabel() != player.getSuitcaseNum()){
			String toScreenC3 = results.getText();
			toScreenC3 += '\n' + case3.toString();
			results.setText(toScreenC3);
			total += case3.getAmount();
		}
		System.out.println("");
		//If players case value is greater than the total of the bankers cases player wins
		String toScreenWin = results.getText();
		if(player.getSuitcaseValue() > total){
			toScreenWin+="\n" + "\n" + "The player wins the game!";
			results.setText(toScreenWin);
		}
		else
		{
			toScreenWin+="\n" + "\n" + "The banker wins the game!";
			results.setText(toScreenWin);
		}
   }
}//end class