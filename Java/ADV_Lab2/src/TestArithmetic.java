/******************************************
 * Lab 2 Advanced Programming
 * Question 3
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class TestArithmetic {

	public static void main(String[] args) throws OverflowException, UnderflowException {
		Arithmetic maths = new Arithmetic();
		System.out.println(maths);
		
		maths.add(-2147483647, -2);
		maths.add(2147483647, 2);
		maths.divide(2, 0);
		System.out.println(maths);

	}

}
