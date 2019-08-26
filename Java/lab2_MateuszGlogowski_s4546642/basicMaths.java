//Mateusz Glogowski s4546642
import java.util.Scanner;
import java.text.DecimalFormat;
public class basicMaths {

	public static void main(String[] args) {
		double num1, num2, div;
		//setting up input
		Scanner scan = new Scanner(System.in);
		//Getting input from the user
		System.out.print("Please enter a decimal number: ");
		num1 = scan.nextDouble();
		System.out.print("Please enter another decimal number: ");
		num2 = scan.nextDouble();
		//Calculating the division
		div = num1/num2;
		//Applying formatting
		DecimalFormat fmt = new DecimalFormat ("0.00");
		//outputting the result
		System.out.println();
		System.out.print("The first number " + num1 + " divided by the second number " + num2 + " is: " + fmt.format(div));
	}

}
