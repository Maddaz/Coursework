/******************************************
 * Lab 1 Advanced Programming
 * Question 4
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public abstract class GeometricObject {
	protected String colour;
	protected boolean filledIn;
	//Constructor
	public GeometricObject(String colour, boolean filledIn){
		this.colour = colour;
		this.filledIn = filledIn;
	}
	//Method to get colour
	public String getColour(){
		return this.colour;
	}
	//Method to set colour
	public void setColour(String colour){
		this.colour = colour;
	}
	//Abstract methods
	public abstract double findArea();
	public abstract double findPerimeter();
}
