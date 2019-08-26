//Class setup
public class ChocolateDrive {
	private String name;
	private int boxesSold;
	//Constructor taking in the name
	public ChocolateDrive(String fundName){
		name = fundName;
		boxesSold = 0;
	}
	//Method to return the name
	public String getName(){
		return name;
	}
	//Method to return the number of boxes sold by each person
	public int getBoxes(){
		return boxesSold;
	}
	//Method used to update sales of each employee
	public int updateSales(int updated){
		boxesSold += updated;
		return boxesSold;	
	}
	//toString method to display data
	public String toString(){
		String toScreen= "";
		toScreen += getName() + ":  " + getBoxes() + " boxes";
		return toScreen;
	}
}
