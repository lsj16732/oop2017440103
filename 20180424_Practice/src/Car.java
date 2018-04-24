
public class Car {
	//Field
	private String color;
	private int speed;
	private int gear;
	
	//Constructor
	public Car(String c, int s, int g) {
		this.color = c;
		this.speed = s;
		this.gear = g;
	}
	
	public Car () {
		this.color = "Green";
		this.speed = 100;
		this.gear = 2;
	}
	
	//Method
	public String toString() {
		return ("Color: "+this.color+" Speed: "+this.speed+" Gear: "+this.gear);
	}

}
