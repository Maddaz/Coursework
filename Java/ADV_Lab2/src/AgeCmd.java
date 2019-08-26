/******************************************
 * Lab 2 Advanced Programming
 * Question 2
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class AgeCmd {

	public static void main(String[] args) {
		try{
			//reading input from the command line
			
			int age = Integer.parseInt(args [0]);
			//System.out.print("Please enter your age: ");
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
		catch(NumberFormatException exception2){
			System.out.println("Error in the input, please enter a number");
		}
	}

}
