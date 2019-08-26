/******************************************
 * Lab 1 Advanced Programming
 * Question 3
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class SavingsAccount extends AccountTwo {
	private static double overdraft;
	
	public SavingsAccount(String owner, double balance) {
		super(owner, balance);
		this.overdraft = -1000.00;
	}
	public double getOverdraft(){
		return this.overdraft;
	}
	@Override
	public void withdraw(double in) {
		//Condition to check if withdrawal has gone bellow 0 but above OverDraft limit
		if(in > this.getBalance() && (this.getBalance() - in) > this.getOverdraft()){
			this.balance -= in;
			this.balance -=30;
			System.out.println(this.toString());
			
		}
		else if((this.getBalance() - in) < this.getOverdraft()){
			System.out.println(this.getOwner() + " your account has insufficient funds to make widthdrawal.");
		}
	}
	public String toString(){
		String toScreen;
		toScreen = this.getOwner() + " Your account has gone bellow a balance of $0 an overdraft fee of $30 has been charged " ;
		toScreen +="\nCurrent Balance: " + "$" +this.getBalance();
		return toScreen;
	}

}
