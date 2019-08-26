/******************************************
 * Lab 2 Advanced Programming
 * Question 3
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class Arithmetic {
	private int answer;
	public Arithmetic(){
		answer = 0;
	}
	
	public void add(int a, int b) throws OverflowException, UnderflowException{
		try{
			answer = a + b;
				//Testing for overflow and use of positive numbers
				if(a > 0 && b > 0 && answer < 0){
					answer = 0;
					throw new OverflowException();
				}
				//Testing for underflow and use of negative numbers
				else if( a < 0 && b < 0 && answer > 0){
					answer = 0;
					throw new UnderflowException();
				}
			}
			catch(OverflowException myexception){
				System.out.println(myexception.getMessage());
			}
			catch(UnderflowException myexception2){
				System.out.println(myexception2.getMessage());
			}
	}
	
	public void divide(int a, int b){
		try{
			answer = a / b;
			//Checking for division by 0
			if(b == 0){
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException myexception3){
			System.out.println("You can not divide by 0!");
		}
	}
	
	public String toString(){
		String toScreen;
		toScreen = "answer: " + answer;
		return toScreen;
	}
}
