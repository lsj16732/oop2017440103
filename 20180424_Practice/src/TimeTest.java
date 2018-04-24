class Time {
	//Field
	private int hour;
	private int minute;
	private int second;
	
	//Constructor
	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}
	
	public Time() {
		this(0, 0, 0);
	}
	
	//Method
	public void setTime(int h, int m, int s) {
		if((h>=0)&&(h<=23))
			hour = h;
		if((m>=0)&&(m<=59))
			minute = m;
		if((s>=0)&&(s<=59))
			second = s;
	}
	
	public String toString() {
		return ("hour: "+hour+" minute: "+minute+" second: "+second);
	}
}
public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(1,36,4);
		System.out.println(time1);
		System.out.println(time2);

	}

}
