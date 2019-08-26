//Mateusz Glogowski s4546642
import java.util.Scanner;
public class AddMachine {

	public static void main(String[] args) {
		final int COUNT_START = 2;
		int num;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		//Setting up input
		System.out.print("Please input a number: ");
		num = scan.nextInt();
		//Error checking for less than 2
		while(num < 2){
			System.out.println("Number needs to be greater than 2... TRY AGAIN");
			System.out.print("Please enter another number");
			num = scan.nextInt();
		}
		//Looping to achieve a total
		for( int i = COUNT_START; i < num + 1; i++){
			if(i % 2 == 0){
			total = total + i;
			}
		}
		//Printing the result
		System.out.println("The total of every number from 2 up until the number you entered is: " + total);
		

	}

}
