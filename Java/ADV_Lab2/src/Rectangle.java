/******************************************
 * Lab 2 Advanced Programming
 * Question 5
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class Rectangle extends GeometricObject {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getWidth(){
		return this.width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getLength(){
		return this.length;
	}
	public void setLength(double length){
		this.length = length;
	}
	@Override
	public double findArea() {
		double result;
		result = this.getLength() * this.getWidth();
		return result;
	}

	@Override
	public double findPerimeter() {
		double result;
		result = (this.length * 2) + (this.width * 2);
		return result;
	}
	public String toString(){
		String toScreen;
		toScreen = this.getColour() + "\t" + this.filledIn + "\t" + this.getLength() + "\t" + this.getWidth();
		return toScreen;
	}

}
