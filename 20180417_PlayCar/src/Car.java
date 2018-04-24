
public class Car {
	//Field
	private String color;
	private int speed;
	
	//���� ����(static variable): Ŭ���� ��� ��ü�� �����ϴ� �ϳ��� ����.
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
	
	//Constructor(������) : �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����.
	public Car(String color, int speed){
		this.color=color;	//this.color: class�� field color, color: �� method�� �Ű�����
		this.speed=speed;
		
		numberOfCars++;
		//��ü �ϳ� ���� �� ���� �� ���������� �ϳ��� ������.
	}
	public Car() {
		numberOfCars++;
	}
	//�� constructor�� �� ������ �־ �����ϵ��� ���ִ� ��!
	//������ ������ overloading! : �Ű������� ���� �˾Ƽ� �̸� ���� ���� �޼ҵ� �� �ϳ��� �������ش�.
	
	//this�� ����ؼ� constructor�� �ҷ��� �� �־�.
	//���� ��� ������ �������� �ϸ� ������ �ӵ��� 100���� �ϰ� �;�! �̷� ���� ��Ȳ���� Ȱ�� ����~
	
	//Method
	public String toString() {
		return ("Color is "+this.color+", Speed is "+this.speed);
	}
	
	//Static Method ����
	public static void print() {
		//����) System.out.println(this.color+","+this.speed);
		//this�� �ش� ��ü�� �����Ѵٴ� ��.
		//static method�� � ��ü�� field�� ������ �� ����. -> static variable�� ���� ����!!
		System.out.println(numberOfCars);
	}
	
}
