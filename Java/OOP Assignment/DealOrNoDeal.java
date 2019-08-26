//**********************************************************
// Programming Assignment
// NBIT Object Oriented Programming NIT2112
// Mateusz Glogowski - s4546642
// Brendan Aked - s4546608
// 
//
// DealOrNoDeal.java
// Console based version of the game, shares almost identical logic to the gui version.
//
//**********************************************************
import java.util.Scanner;
public class DealOrNoDeal {

	public static void main(String[] args) {
	   	Suitcase case1 = new Suitcase(0);
		Suitcase case2 = new Suitcase(0);
		Suitcase case3 = new Suitcase(0);
		Player player = new Player(0);
		int playerChoice;
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println(welcome());
		//Prompting for input:
		System.out.print("Please Select your suitcase(1-3): "); 
		//Error checking to prevent player entering values other than ints.
		while(!input.hasNextInt()){
			System.out.print("Input needs to be a number(1-3):");
			input.next();
		}
		//Once choice is confirmed as an int set it to player choice
		playerChoice = input.nextInt();
		System.out.println("");
		System.out.println("");
		//Starting the game
		StartGame game = new StartGame(playerChoice,case1,case2,case3,player);
		//Printing Results of game.
		System.out.println("Player has chosen suitcase: " + player.getSuitcaseNum() + " with value " + player.getSuitcaseValue());
		System.out.println("Bank has:-");
		/*Printing banks case labels, determined by comparing each case label
		to the players selectedCase, also adding the total of the bank cases*/
		if(case1.getLabel() != player.getSuitcaseNum()){
			System.out.println(case1.toString());
			total += case1.getAmount();
		}
		if(case2.getLabel() != player.getSuitcaseNum()){
			System.out.println(case2.toString());
			total += case2.getAmount();
		}
		if(case3.getLabel() != player.getSuitcaseNum()){
			System.out.println(case3.toString());
			total += case3.getAmount();
		}
		System.out.println("");
		//If players case value is greater than the total of the bankers cases player wins
		if(player.getSuitcaseValue() > total){
			System.out.println("Player wins the game!");
		}
		else
		{
			System.out.println("Banker wins the game!");
		}
	}

	//Welcome print method.
	public static String welcome(){
		String welcome ="";
		welcome += "******* Welcome to the Suitcase and Player Game *******";
		return welcome;
	}
}
