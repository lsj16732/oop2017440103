class Date {
	//Field
	private int year;
	private int month;
	private int day;
	
	//Constructor
	public Date (int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public Date() {
		year = 2009;
		month = 1;
		day = 1;
	}
	
	public Date(int y) {
		this(y,1,1);
	}
	
	//Method
	public String toString() {
		return ("year="+year+" month="+month+" day="+day);
	}
}

public class DateTest {

	public static void main(String[] args) {
		//Instance
		Date date1 = new Date(2018,4,24);
		Date date2 = new Date();
		Date date3 = new Date(2020);

		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
