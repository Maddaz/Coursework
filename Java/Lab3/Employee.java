
public class Employee {
	private String name;
	private int salary;
	//Constructor for employee
	public Employee(String newName, int newSalary){
		name = newName;
		salary = newSalary;
	}
	//raiseSalary updating via input of percentage
	public int raiseSalary(double byPercent){
		double tempSalary = salary * byPercent;
		salary += tempSalary;
		return salary;
	}
	//method for printing employees name and salary
	public String employeePrint(){
		String toScreen = "";
		toScreen += "Name: " + name + "\t" + "Salary: " + "$" + salary;
		return toScreen;
	}
	//Returning Salary
	public int getSalary(){
		return salary;
	}
	public String toString(double percentage){
		String toScreen = "";
		toScreen += "Salary of " + name + " after a raise of " + (int)(percentage) +"% is $" + salary;
		return toScreen;
	}
}
