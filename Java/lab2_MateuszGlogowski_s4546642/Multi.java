//Mateusz Glogowski s4546642
import java.util.Scanner;
public class Multi {
	public static void main(String[] args) {
		//Declaring variables
		int num;
		int count = 0;
		int total = 1;
		//Setting scanner object
		Scanner scan = new Scanner(System.in);
		//Prompting for input
		System.out.print("Enter a number greater than 0: ");
		num = scan.nextInt();
		//Error checking
		while(num <= 0){
			System.out.println("Error! number is less than or equal to zero!");
			System.out.print("Please try again: ");
			num = scan.nextInt();
		}
		//For loop for calculation and printing
		for(count = num; count > 0 ; count--){
			if(count != 1){
				System.out.print(count + " * ");
				total *= count;
			}
			else if(count == 1){
				System.out.print(count);	
			}
		}
		System.out.print(" = " + total);
		

	}

}
