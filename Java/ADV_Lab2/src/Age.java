/******************************************
 * Lab 2 Advanced Programming
 * Question 1
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import java.util.*;
public class Age {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		try{
			System.out.print("Please enter your age: ");
			age = input.nextInt();
			if(age <= 12){
				System.out.println("You are very young");
			}
			else if(age > 12 && age < 20){
				System.out.println("You are a teenager");
			}
			else if(age > 20){
				System.out.println("WOW " + age + " is old!");
			}
		}
		catch(InputMismatchException myException){
			System.out.println("Error in the input, please enter a number");
		}
	}
}
