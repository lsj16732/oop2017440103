import java.util.Scanner;

class Date {
	private int year;
	private String month;
	private int day;
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int y) {
		this.year=y;
	}
	public String getMonth() {
		return this.month;
	}
	public void setMonth(String m) {
		this.month=m;
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		this.day=d;
	}
	
	public void setDate() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("�⵵ �Է�:");
		this.year = s.nextInt();
		
		System.out.println("�� �Է�:");
		this.month = s.nextLine();
		
		System.out.println("�� �Է�:");
		this.day=s.nextInt();
	}
	
	public void printDate() {
		System.out.println(this.year+"��"+this.month+"��"+this.day+"��");
	}
}

public class TestDate {
	public static void main(String[] args) {
		Date myDate = new Date();
		myDate.setDate();
		myDate.printDate();
	}
}
