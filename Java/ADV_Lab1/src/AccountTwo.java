/******************************************
 * Lab 1 Advanced Programming
 * Question 3
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
import java.text.NumberFormat;
public abstract class AccountTwo {
	protected String owner;
	protected static int accountCounter = 12345;
	protected double balance;
	protected static double interest = 5;
	protected final int accountNo;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	public AccountTwo (String owner, double balance){
		this.owner = owner;
		this.balance = balance;
		this.accountNo = accountCounter++;
	}
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
	public abstract void withdraw(double in);
	//Method for adding interest to an account
	public void addInterest(){
		this.balance = (this.balance * (interest/100) + this.balance);
	}
	public String toString(){
		String toScreen;
		toScreen = "Account Number : " + "\t" + this.getAccountNo();
		toScreen += "\nBalance : " + "\t\t" + formatter.format(this.getBalance());
		return toScreen;
	}
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
