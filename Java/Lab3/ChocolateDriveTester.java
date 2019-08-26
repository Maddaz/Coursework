import java.util.Scanner;
public class ChocolateDriveTester {

	public static void main(String[] args) {
		//Setting up variable and objects
		int weeklyTotal, i = 1, x = 1;
		Scanner input = new Scanner(System.in);
		ChocolateDrive emp1 = new ChocolateDrive("Joe");
		ChocolateDrive emp2 = new ChocolateDrive("Jessica");
		//Loops to retrieve 3 weeks of data from each fundraiser
		while(i < 4){
			System.out.print("Enter the number of boxes sold by " +emp1.getName() +" this week: ");
			weeklyTotal = input.nextInt();
			emp1.updateSales(weeklyTotal);
			System.out.print("Enter the number of boxes sold by " + emp2.getName() + " this week: ");
			weeklyTotal = input.nextInt();
			emp2.updateSales(weeklyTotal);
			i++;
		}
		//Printing out the final results for each fundraiser
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());

	}

}
