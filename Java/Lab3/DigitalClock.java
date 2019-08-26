import java.text.DecimalFormat;
import java.util.*;
public class DigitalClock {
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	
	public DigitalClock(int h, int m, int s){
		hours = h;
		minutes = m;
		seconds = s;
	}
	//Sets hours to 0 when hours reaches 24
	void setHours(int hrs){
		hours = 0;
	}
	//sets minutes to 0, used when minutes reach 60
	void setMinutes(int mins){
		minutes = 0;
	}
	//Sets seconds to 0, used when seconds reach 60
	void setSeconds(int secs){
		seconds = 0;
	}
	//Second tick method
	void tick(){
		seconds++;
	}
	//String display method
	public String displayTime(){
		DecimalFormat df = new DecimalFormat("00");
		String toScreen = "";
		toScreen += "| " + df.format((double)hours) + ":" + df.format((double)minutes) + "." + df.format((double)seconds) + " |";
		return toScreen; 
	}
	//Validation method to control tick and correct number ranges
	void validateTick(){
		if(hours == 24){
			setHours(0);
		}
		else if(minutes == 60){
			setMinutes(0);
			hours++;
		}
		else if(seconds == 60){
			setSeconds(0);
			minutes++;
		}
	}
	
}
