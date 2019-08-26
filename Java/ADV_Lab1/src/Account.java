/******************************************
 * Lab 1 Advanced Programming
 * Question 2
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
//Account one is to be used with Question 2
import java.text.NumberFormat;
public class Account {
	private String owner;
	private static int accountCounter = 12345;
	private double balance;
	private static double interest = 5;
	public final int accountNo;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	//constructor
	public Account (String owner, double balance){
		this.owner = owner;
		this.balance = balance;
		this.accountNo = accountCounter++;
	}
	//Getters and Setters
	public String getOwner(){
		return this.owner;
	}
	public double getBalance(){
		return this.balance;
	}
	public int getAccountNo(){
		return this.accountNo;
	}
	public void setOwner(String name){
		this.owner = name;
	}
	public void deposit(double in){
		if(in > 0){
			this.balance += in;
		}
		else{
			System.out.println("You must deposit a positive amount");
		}
		
	}
	//Makes withdrawal unless amount being withdrawn is greater than balance
	public void withdraw(double in){
		if(this.balance > in){
			this.balance -= in;
		}
		else{
			System.out.println("Not enough money in the account no: " + this.getAccountNo() +", transaction canceled");
		}
	}
	public void addInterest(){
		this.balance = (this.balance * (interest/100) + this.balance);
	}
	public String toString(){
		String toScreen;
		toScreen = "Account Number : " + "\t" + this.getAccountNo();
		toScreen += "\nBalance : " + "\t\t" + formatter.format(this.getBalance());
		return toScreen;
	}
	//Overriden equals method to compare account owners.
	public boolean equals(Account otherAccount){
		boolean result;
		if((otherAccount.getOwner()).equals(this.getOwner())){
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
