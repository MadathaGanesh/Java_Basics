package Method_Overloading;

public class Time_Duration {

	private static String Invalid_value="No correct value ";

	public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(-42));
		System.out.println(getDurationString(65,9));
	}
	
	public static String getDurationString(int minutes,int seconds) {
		if ((minutes<0)||(seconds<0)||(seconds>60)){
			return Invalid_value;
		}
		else {
			int hours=minutes/60;
			int remaining_Minutes=minutes%60;
			
			String hoursString=hours+"h";
			if(hours<10) {
				hoursString="0"+hoursString;
			}
			
			String minutesString=minutes+"m";
			if(minutes<10) {
				minutesString="0"+minutesString;
			}
			
			String secondsString=seconds+"s";
			if(seconds<10) {
				secondsString="0"+secondsString;
			}
			return hoursString+" "+minutesString+" "+secondsString;
		}
	}
	
	public static String getDurationString(int seconds) {
		if(seconds<0) {
		return Invalid_value;
	}
		else {
			int minutes=seconds/60;
			int remainingseconds=seconds%60;
			return getDurationString(minutes,remainingseconds);
		}
	}
	
		
}


