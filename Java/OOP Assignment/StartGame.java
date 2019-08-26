import java.util.Random;

public class StartGame {
	private int playerChoice;
	public StartGame(int choice, Suitcase case1, Suitcase case2, Suitcase case3, Player player){
		playerChoice = choice;
		//Setting up variables for playerChoice and 3 random integers
 		int a = 0, b = 0, c = 0;
 		//Setting up and creating random variables within a range of 1-3
 		Random rand = new Random();
 		//Generating 3 random ints, a will always be unique, need to check b and c
 		a = rand.nextInt(3) + 1;
 		b = rand.nextInt(3) + 1;
 		//Making sure that B is unique
 		if(a == b){
 			b = caseCheck(a,b);
 		}
 		c = rand.nextInt(3) + 1;
 		//Making sure that c is unique
 		if(c == a || c == b){
 			c = caseCheckThree(a,b,c);
 		}
 		
 		//Switch a sets amount to case1 based on value in a
 		switch (a){
 			case 1:
 				case1.setAmount(20);
 				case1.setLabel(1);
 				break;
 			case 2:
 				case1.setAmount(50);
 				case1.setLabel(1);
 				break;
 			case 3:
 				case1.setAmount(100);
 				case1.setLabel(1);
 				break;		
 		}
 		//Switch b sets amount to case2 based on value in b
 		switch (b){
 			case 1:
 				case2.setAmount(20);
 				case2.setLabel(2);
 				break;
 			case 2:
 				case2.setAmount(50);
 				case2.setLabel(2);
 				break;
 			case 3:
 				case2.setAmount(100);
 				case2.setLabel(2);
 				break;		
 		}
 		//Switch c sets amount to case3 based on value in c
 		switch (c){
 			case 1:
 				case3.setAmount(20);
 				case3.setLabel(3);
 				break;
 			case 2:
 				case3.setAmount(50);
 				case3.setLabel(3);
 				break;
 			case 3:
 				case3.setAmount(100);
 				case3.setLabel(3);
 				break;		
 		}

 		//Populating player object based on caselabels and playerChoice
 		if(case1.getLabel() == playerChoice){
 			player.setSuitcaseNum(playerChoice);
 			player.setSuitcaseValue(case1.getAmount());
 		}
 		else if(case2.getLabel() == playerChoice){
 			player.setSuitcaseNum(playerChoice);
 			player.setSuitcaseValue(case2.getAmount());
 		}
 		else if(case3.getLabel() == playerChoice){
 			player.setSuitcaseNum(playerChoice);
 			player.setSuitcaseValue(case3.getAmount());
 		}
 		else{
 			player.setSuitcaseNum(3);
 			player.setSuitcaseValue(case3.getAmount());
 		}
		
	}
	//Method for comparing the first two random ints for unique values
	   public static int caseCheck(int a, int b){
			while(b == a){
				Random rand = new Random();
				b =  rand.nextInt(3) + 1;
			}
			return b;
		}
		//Checking to make sure that a, b and c are unique
		public static int caseCheckThree(int a, int b, int c){
			while(c == a || c == b){
				Random rand = new Random();
				c =  rand.nextInt(3) + 1;
			}
			return c;
		}
}
