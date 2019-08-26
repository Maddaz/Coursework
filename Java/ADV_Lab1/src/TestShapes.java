/******************************************
 * Lab 1 Advanced Programming
 * Question 4
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class TestShapes {

	public static void main(String[] args) {
		//Initialize array
		GeometricObject [] shapes = new GeometricObject[5];
		//Populate Array
		shapes[0] = new Circle("pink",true,4.5);
		shapes[1] = new Circle("blue",false,3.1);
		shapes[2] = new Rectangle("cyan", true,2.0,2.4);
		shapes[3] = new Circle("green", true, 3.6);
		shapes[4] = new Rectangle("orange", false,5.0,1.4);
		//Print object details
		printDetails(shapes);
		//Print object perimeter
		printPerimeter(shapes);
		//Print object area
		printArea(shapes);

	}
	//Printing Methods
	public static void printDetails(GeometricObject[] shapes){
		System.out.println("The details for each object is");
		for(int x=0; x<shapes.length;x++){
			System.out.println("Object " + (x+1) + " is " + shapes[x].toString());
		}
	}
	public static void printPerimeter(GeometricObject[] shapes){
		System.out.print("\n\n");
		System.out.println("The perimeter for each object is");
		for(int x=0; x<shapes.length; x++){
			System.out.println("Object " + (x+1) + " is " + shapes[x].findPerimeter());
		}
	}
	public static void printArea(GeometricObject[] shapes){
		System.out.print("\n\n");
		System.out.println("The area for each object is");
		for(int x=0; x<shapes.length; x++){
			System.out.println("Object " + (x+1) + " is " + shapes[x].findArea());
		}
	}
}
