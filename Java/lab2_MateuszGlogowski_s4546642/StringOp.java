//Mateusz Glogowski s4546642
import java.util.Scanner;
public class StringOp {

	public static void main(String[] args) {
		//Declaring variables
		String sentence;
		int length;
		String oi;
		//Setting scanner object
		Scanner scan = new Scanner(System.in);
		//Prompting for input
		System.out.print("Hello, please enter a sentence for processing :");
		sentence = scan.nextLine();
		length = sentence.length();
		oi = "oi " + sentence + " oi, oi, oi!";
		System.out.println("Your sentence is " + length + " characters long");
		System.out.println("The first letter of your sentence is " + sentence.charAt(0));
		System.out.println("The last letter of your sentence is " + sentence.charAt(sentence.length() - 1));
		System.out.println("The middle character is " + (sentence.charAt((sentence.length() - 1) / 2)));
		System.out.println(oi);
	}
}
