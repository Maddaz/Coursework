
public class testDigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		DigitalClock clock1 = new DigitalClock(10,35,00);

/*		while( i  < 600){
			System.out.println(clock1.displayTime());
			clock1.tick();
			i++;
			clock1.validateTick();
		}*/
		//Using try and catch to allow for a thread sleep of 1 second between prints.
		try {
			while (true) {
				System.out.println(clock1.displayTime());
				clock1.tick();
				i++;
				//Validating the tick to ensure the numbers being displayed are within the correct ranges
				clock1.validateTick();
				Thread.sleep(1000);				
			}
		} 
		catch (InterruptedException ex) {
				  
		}
	}
}
