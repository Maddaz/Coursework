/******************************************
 * Lab 1 Advanced Programming
 * Question 4
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class Circle extends GeometricObject {
	private double radius;
	private static double pi = 3.14;
	//Constructor
	public Circle(String colour, boolean filledIn, double radius) {
		super(colour, filledIn);
		this.radius = radius;
	}
	//Method to get radius
	public double getRadius(){
		return this.radius;
	}
	//Method to set radius
	public void setRadius(double radius){
		this.radius = radius;
	}
	//Overriden abstract methods from super class
	@Override
	public double findArea() {
		double result;
		result = pi *(this.getRadius() * this.getRadius());
		return result;
	}

	@Override
	public double findPerimeter() {
		double result;
		result = 2 * pi * this.getRadius();
		return result;
	}
	public String toString(){
		String toScreen;
		toScreen = this.getColour() + "\t" + this.filledIn + "\t" + this.getRadius();
		return toScreen;
	}
}
