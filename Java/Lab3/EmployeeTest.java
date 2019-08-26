import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		//setting up variables
		double percent, decPercent;
		int salary;
		String name;
		//Setting up scanner object
		Scanner input = new Scanner(System.in);
		//Prompting for user input
		System.out.print("Please input the employees name: ");
		name = input.nextLine();
		System.out.print("Please Enter the employees salary: ");
		salary = input.nextInt();
		//Creating Employee object using users input
		Employee person = new Employee(name, salary);
		System.out.print("Enter the percentage you would like to raise employees salary by: ");
		percent = input.nextDouble();
		//Setting up percentages
		decPercent = percent / 100;
		//Calling printing methods which utilize toString
		System.out.println(person.employeePrint());
		person.raiseSalary(decPercent);
		System.out.print(person.toString(percent));
	}

}
