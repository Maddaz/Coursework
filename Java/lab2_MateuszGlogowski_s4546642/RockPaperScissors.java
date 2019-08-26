//Mateusz Glogowski s4546642
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		//setting up array for valid selections.
		String[] options = {"R","P","C"};
		//Declaring variables
		String personPlay;
		String computerPlay = null;
		String fullCompPlay = null;
		String upperPersonPlay;
		//setting up scanner and random objects
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		//prompting input from player and formatting
		System.out.print("Enter your play: R for Rock, S for Scissors or P for Paper: ");
		personPlay = scan.next();
		upperPersonPlay = personPlay.toUpperCase();
		//Checking for valid input from the user
		while(!Arrays.asList(options).contains(upperPersonPlay)){
			System.out.print("That is an invalid move, please try again: ");
			personPlay = scan.next();
			upperPersonPlay = personPlay.toUpperCase();
		}
		System.out.println(upperPersonPlay);
		//generating computers random move
		int compNum = generator.nextInt((3 - 1) + 1) + 1;
		
		//assigning moved based on random number
		switch (compNum) {
		case 1: 
			computerPlay = ("R");
			fullCompPlay = ("Rock");
			break;
		case 2:
			computerPlay = ("P");
			fullCompPlay = ("Paper");
			break;
		case 3:
			computerPlay = ("S");
			fullCompPlay = ("Scissors");
			break;
		} 
		
		System.out.println("The computer throws " + fullCompPlay);
		//Logic behind who wins or loses.
		if (upperPersonPlay.equals(computerPlay)){
			System.out.println("It's a tie!");
		} else if (upperPersonPlay.equals("R")){
			if (computerPlay.equals("S")){
				System.out.println("Nothing beats rock. " + "You win!!");
			}else if(computerPlay.equals("P")){
				System.out.println("Paper defeats rock! " + "You lose!!");
			}
		} else if (upperPersonPlay.equals("S")){
			if (computerPlay.equals("P")){
				System.out.println("Scissors cut through paper! " + "You win!!");
			} else if(computerPlay.equals("R")){
				System.out.println("Rocks crushes scissors, sorry. " + "You lose!!");
			}
		}else if (upperPersonPlay.equals("P")){
			if (computerPlay.equals("R")){
				System.out.println("Paper wraps rock. " + "You win!!");
			} else if (computerPlay.equals("S")){
				System.out.println("Scissors slice through paper. " + "You lose!!");
			}
		}
	}
}
