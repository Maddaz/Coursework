/******************************************
 * Lab 1 Advanced Programming
 * Question 3
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class AllAccountTest {

	public static void main(String[] args) {
		
		AccountTwo [] accountList = new AccountTwo[5];
		accountList[0] = new OnLineAccount("Jake Harrison", 600.00);
		accountList[1] = new OnLineAccount("Rob Blake", 900.00);
		accountList[2] = new SavingsAccount("Jeniffer Lowe", 800.00);
		accountList[3] = new SavingsAccount("Sam Perkins", 1800.00);
		accountList[4] = new SavingsAccount("Tim Harrison", 130.00);
		//Print out of accounts before methods for reference
		printAccounts(accountList);
		accountList[0].withdraw(150);
		accountList[1].withdraw(1000);
		accountList[2].withdraw(810);
		accountList[3].withdraw(2900);
		//display account details after withdrawals
		printAccounts(accountList);
		
	}
	//Method for printing account details, name, number balance.
	public static void printAccounts(AccountTwo[] list){
		for(int x=0; x < list.length; x++){
			System.out.println("Owner : " +"\t\t" + list[x].getOwner());
			System.out.println("Account Number : " + "\t" + list[x].getAccountNo());
			System.out.println("Balance : " + "\t\t" + "$" + list[x].getBalance());
		}
	}
}
