class Date{
	int year;
	int month1;
	String month2;
	int day;
	
	void setYear(int year) {
		this.year = year;
	}
	
	void setMonth1(int month1) {
		this.month1 = month1;
	}
	
	void setMonth2(String month2) {
		this.month2 = month2;
	}
	
	void setDay(int day) {
		this.day = day;
	}
	
	void print1() {
		System.out.println(year+"."+month1+"."+day);
	}
	
	void print2() {
		System.out.println(month2+" "+day+", "+year);
	}
}

public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		d.setYear(2012);
		d.setMonth1(7);
		d.setMonth2("July");
		d.setDay(12);
		d.print1();
		d.print2();
	}

}
