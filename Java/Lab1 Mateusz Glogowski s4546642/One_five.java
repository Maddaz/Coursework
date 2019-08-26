//Mateusz Glogowski s4546642
public class One_five {

	public static void main(String[] args) {
		final int MINUTES_PER_HOUR = 60;
		final int SECONDS_PER_MINUTE = 60;
		int hours =  72;
		int minutes = hours * MINUTES_PER_HOUR;
		int seconds = minutes * SECONDS_PER_MINUTE;
		System.out.println(hours + " hours is made up of " + minutes + " minutes or " + seconds + " seconds");
	}

}
