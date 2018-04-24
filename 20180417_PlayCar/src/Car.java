
public class Car {
	//Field
	private String color;
	private int speed;
	
	//정적 변수(static variable): 클라스의 모든 객체가 공유하는 하나의 변수.
	public static int numberOfCars=0;
	
	//Getters&Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//Constructor(생성자) : 메소드명이 클라스 이름과 같다. 반환형이 없다.
	public Car(String color, int speed){
		this.color=color;	//this.color: class의 field color, color: 이 method의 매개변수
		this.speed=speed;
		
		numberOfCars++;
		//객체 하나 만들 때 마다 이 정적변수가 하나씩 증가해.
	}
	public Car() {
		numberOfCars++;
	}
	//이 constructor는 빈 공간을 넣어도 가능하도록 해주는 것!
	//일종의 생성자 overloading! : 매개변수에 따라 알아서 이름 같은 여러 메소드 중 하나를 선택해준다.
	
	//this를 사용해서 constructor를 불러올 수 있어.
	//예를 들면 색상을 빨강으로 하면 무조건 속도를 100으로 하고 싶어! 이런 식의 상황에서 활용 가능~
	
	//Method
	public String toString() {
		return ("Color is "+this.color+", Speed is "+this.speed);
	}
	
	//Static Method 생성
	public static void print() {
		//에러) System.out.println(this.color+","+this.speed);
		//this는 해당 객체에 접근한다는 뜻.
		//static method는 어떤 객체의 field에 접근할 수 없어. -> static variable만 접근 가능!!
		System.out.println(numberOfCars);
	}
	
}
