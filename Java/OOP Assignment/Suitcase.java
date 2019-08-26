//**********************************************************
// Programming Assignment
// NBIT Object Oriented Programming NIT2112
// Mateusz Glogowski - s4546642
// Brendan Aked - s4546608
// 
//
// Suitcase.java
// Suitcase class to be used by the GamePanel class
//
//**********************************************************
public class Suitcase {
	//Default class variables
	private int label;
	private int amount;
	//Suitcase class constructor
	public Suitcase(int amt){
		amount = amt;
	}
	//Set method for suitcase dollar value
	void setAmount(int amt){
		amount = amt;
	}
	//Set method to set suitcase number
	void setLabel(int lab){
		label = lab;
	}
	//Returns the case number
	public int getLabel(){
		return label;
	}
	//Returns the case amount
	public int getAmount(){
		return amount;
	}	
	//toString method which displays a selected cases details
	public String toString(){
		String toScreen = "";
		toScreen += "Suitcase " + getLabel() + " with amount " + getAmount();
		return toScreen;
	}	
}
