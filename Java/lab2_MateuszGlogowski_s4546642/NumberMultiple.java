//Mateusz Glogowski s4546642
public class NumberMultiple {

	public static void main(String[] args) {
		//declaring variables
		int i,x = 0;
		int count = 1;
		int total;
		//Nested for loop for calculating and printing
		for(i = 0; i < 10; i++){
			for(x = 0; x < 7; x++){
				//Calculating number to print
				total = count * 7;
				//Tracking the counter
				count +=1;
				System.out.print(total + "\t");
			}
			//Printing next line;
			System.out.println();
		}
	}
}
