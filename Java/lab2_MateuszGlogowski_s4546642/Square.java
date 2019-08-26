import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		//declaring variables;
		int num;
		String symbol = null;
		int a,b,i,x = 0;
		//Setting up scanner object
		Scanner scan = new Scanner(System.in);
		//Prompting user for input
		System.out.print("Please enter a number: ");
		num = scan.nextInt();
		System.out.print("Please enter a symbol: ");
		symbol = scan.next();
		
		//Using nested for loops to print * and spaces in the correct position
		for(a = 0; a < num; a++){
			if(a == 0){
				//Using input num to print the top line of the square
				for(i = 0; i < num; i++){
					System.out.print(symbol + " ");
				}
				System.out.println("");
			}
			if((a != 0) && (a != num - 1)){
				System.out.print(symbol + " ");
				for(x = 0; x < num - 2; x++){
					System.out.print("  ");
				}
				System.out.println(symbol);
			}
			if((a + 1) == num){
				//For loop for printing the bottom row
				for(b = 0; b < num; b++){
					System.out.print(symbol + " ");
				}	
			}
		}
	}
}
