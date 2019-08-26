/******************************************
 * Lab 1 Advanced Programming
 * Question 2
 * Author: Mateusz Glogowski s4546642  
 ******************************************/
public class TestAccount {

	public static void main(String[] args) {
		int counter = 0;
		Account [] accountList = new Account[5];
		accountList[0] = new Account("David Lee", 100.00);
		accountList[1] = new Account("Sam Smith", 120.00);
		accountList[2] = new Account("Joe Watson", 240.00);
		accountList[3] = new Account("Jenny Craig", 120.00);
		accountList[4] = new Account("Max Power", 300.00);
		//Initial State of accounts
		printAccounts(accountList);
		//Adding interest to David Lees account
		accountList[0].addInterest();
		//Depositing $200 to Max Power
		accountList[4].deposit(200);
		//Depositing -$10 to Max Power
		accountList[4].deposit(-10);
		//Withdrawing $20 from Sam Smith
		accountList[1].withdraw(20);
		//Over withdrawing from Sam Smith
		accountList[1].withdraw(200);
		//Changing account name Joe Watson to Jenny Craig
		accountList[2].setOwner("Jenny Craig");
		//Altered state
		printAccounts(accountList);
		System.out.println("Is account " + accountList[1].accountNo + " the same owner as " + accountList[2].accountNo + " : " + accountList[1].equals(accountList[2]));
		//checking how many accounts each owner has.
		for(int x=0; x < accountList.length; x++){
			for(int y=0; y < accountList.length; y++){
				if(accountList[x].equals(accountList[y])){
					counter++;
				}
			}
			System.out.println(accountList[x].getOwner() + " has " + counter + " account(s)");
			counter = 0;
		}
	}
	//Method for printing account details.
	public static void printAccounts(Account[] list){
		for(int x=0; x < list.length; x++){
			System.out.println("Owner : " +"\t\t" + list[x].getOwner());
			System.out.println(list[x].toString());
		}
	}
}
