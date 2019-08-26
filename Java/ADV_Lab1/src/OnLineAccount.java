/******************************************
 * Lab 1 Advanced Programming
 * Question 3
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class OnLineAccount extends AccountTwo {
	private static double minimumBalance;
	public OnLineAccount(String owner, double balance) {
		super(owner, balance);
		this.minimumBalance = 500.00;
	}
	public double getMinimum(){
		return this.minimumBalance;
	}
	@Override
	//Checks to ensure no withdraw past $0 occurs
	public void withdraw(double in) {
		if(in > this.balance){
			System.out.println(this.getOwner() + " your account does not have enough funds to make withdrawal");
		}
		else{
			this.balance -= in;
		}
		//Charging a $25 fee if minimum Balance is passed, also prints message
		if(this.balance < this.minimumBalance){
			this.balance -= 25.00;
			System.out.println(this.toString());
		}
	}
	public String toString(){
		String toScreen;
		toScreen =this.getOwner() + " your account has gone bellow minimum balance of " + formatter.format(this.getMinimum()) + " a $25 fee has been charged. \nNew balance: " + formatter.format(this.getBalance());
		return toScreen;
	}


}
