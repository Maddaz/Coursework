/******************************************
 * Lab 1 Advanced Programming
 * Question 1
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import java.util.*;
public class LecturerTest {

	public static void main(String[] args) {
		ArrayList<Lecturer> staffList = new ArrayList<Lecturer>();
		staffList.add(new Lecturer("Grace","Tan",99194685,"Ms"));
		staffList.add(new Lecturer("Sunam","Pradham",99191234,"Mr"));
		staffList.add(new Lecturer("Jakub","Szajam",99194286,"Dr"));
		staffList.add(new Lecturer("Yuan", "Miao",99194605,"Professor"));
		staffList.add(new Lecturer("Hao","Shi",99194060,"Course coordinator"));
		staffList.add(new Lecturer("Grace","Tan",99194685,"Ms"));
		staffList.add(new Lecturer("Hao","Shi",99194060,"Course coordinator"));
		
/*		ORIGINAL ARRAY USED
  		Lecturer [] staffList = new Lecturer[7];
		staffList[0] = new Lecturer("Grace","Tan",99194685,"Ms");
		staffList[1] = new Lecturer("Sunam","Pradham",99191234,"Mr");
		staffList[2] = new Lecturer("Jakub","Szajam",99194286,"Dr");
		staffList[3] = new Lecturer("Yuan", "Miao",99194605,"Professor");
		staffList[4] = new Lecturer("Hao","Shi",99194060,"Course coordinator");
		staffList[5] = new Lecturer("Grace","Tan",99194685,"Ms");
		staffList[6] = new Lecturer("Hao","Shi",99194060,"Course coordinator"); 
*/
		
		for(int x = 0; x < staffList.size(); x++){
			//If statement preventing null values in array from being printed.
			if(staffList.get(x) != null){
				System.out.print(staffList.get(x).toScreen());
			}
		}
		//Printing Staff members phone numbers
		printNumbers(staffList);
		//Promoting a lecturer to a professor
		staffList.get(0).updateTitle(staffList);
		//Checking for duplicate lecturers
		OUTER_LOOP:
		for(int x=0; x<staffList.size(); x++){
			for(int y=0; y<staffList.size(); y++){
				//Making sure its not comparing the same lecturer to themselves and not checking null entries in the array
				if(x != y && staffList.get(x) != null && staffList.get(y) != null){
					if(staffList.get(x).equals(staffList.get(y)) == true){
						System.out.println(staffList.get(x).equals(staffList.get(y)));
						break OUTER_LOOP;
					}
				}
			}
		}
	}
	//method used for printing phone numbers,
	public static void printNumbers(ArrayList<Lecturer> staffList){
		System.out.println("\n\nPhone numbers:");
		for(int x = 0; x < staffList.size(); x++){
			//If statement preventing null values in array from being printed.
			if(staffList.get(x) != null){
				System.out.println(staffList.get(x).getPhoneNo());
			}
		}
	} 
}

