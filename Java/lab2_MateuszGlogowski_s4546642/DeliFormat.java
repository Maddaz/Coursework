//Mateusz Glogowski s4546642
import java.util.Scanner;
import java.text.DecimalFormat;

public class DeliFormat {

	public static void main(String[] args) {
		final double GRAMS_PER_KILOGRAM = 1000;
		//initiating variables
		double pricePerKG;
		double weightGrams;
		double weight;
		double totalPrice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the CS Deli!!\n ");
		//Prompting for input
		System.out.print("Enter the price per kg of item: ");
		pricePerKG = scan.nextDouble();
		
		System.out.print("Enter the weight(grams): ");
		weightGrams = scan.nextDouble();
		
		weight = weightGrams / GRAMS_PER_KILOGRAM;
		totalPrice = pricePerKG * weight;
		DecimalFormat fmt = new DecimalFormat ("0.00");
		
		System.out.println("*****  CS Deli  *****");
		System.out.println();
		System.out.println("Unit price: " + pricePerKG + " per kilogram");
		System.out.println("Weight:   " + fmt.format(weight) + "Kilogram");
		System.out.println();
		System.out.println("TOTAL:   $" + fmt.format(totalPrice));
		
		
		

	}

}
