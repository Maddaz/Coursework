/******************************************
 * Lab 1 Advanced Programming
 * Question 1
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import java.util.ArrayList;

public class Lecturer {
	private String firstName;
	private String familyName;
	private int phoneNo;
	private String title;
	
	public Lecturer(String firstNameIn, String familyNameIn, int phoneNoIn, String titleIn){
		firstName = firstNameIn;
		familyName = familyNameIn;
		phoneNo = phoneNoIn;
		title = titleIn;
	}
	public String getFamilyName(){
		return familyName;
	}
	public String getFirstName(){
		return firstName;
	}
	public int getPhoneNo(){
		return phoneNo;
	}
	public void setTitle(String titleIn){
		title = titleIn;
	}
	public String toScreen(){
		String toScreen;
		toScreen = "\n\n" + title + "\t" + firstName + "\t" + familyName;
		toScreen += "\nPhone: " + phoneNo; 
		return toScreen;
	}
	
	public boolean equals(Lecturer otherLecturer){
		boolean result;
		if((otherLecturer.firstName).equals(this.firstName) && (otherLecturer.familyName).equals(this.familyName)){
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	//Do we assume that we already know the current lecturers position in the array?
	public void updateTitle(ArrayList<Lecturer> staffList){
		this.title = "Professor";
		System.out.println("**************************");
		System.out.println("A promotion for " + this.getFirstName());
		System.out.print(this.toScreen());
		System.out.println("\n**************************");
	}
}

