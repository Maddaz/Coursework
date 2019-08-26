//**********************************************************
// Programming Assignment
// NBIT Object Oriented Programming NIT2112
// Mateusz Glogowski - s4546642
// Brendan Aked - s4546608
// 
//
// Player.java
// Player class to be used in the GamePanel class
//
//**********************************************************
public class Player {
	//Default variables
	private int selectedCase;
	private int amount;
	//Constructor
	public Player(int selected){
		selectedCase = selected;
		amount = 0;
	}
	//Get statement for the suitcase value
	public int getSuitcaseValue(){
		return amount;
	}
	//Get statement for the selected player case
	public int getSuitcaseNum(){
		return selectedCase;
	}
	//Set method for choosing the players case value
	public void setSuitcaseValue(int value){
		amount = value;
	}
	//Set method for choosing the players case number
	public void setSuitcaseNum(int caseNum){
		selectedCase = caseNum;
	}
}
