
public abstract class Polygon {	//abstract class: 객체를 만들 수 없는 클라스
	//주로, 객체를 만들기 위해서가 아닌, 상속을 하기 위해서 만드는 클라스.
	public double height;
	public double width;
	
	public abstract double area();	//abstract method: 함수의 몸통을 만들어주지 않아도 돼.
	//이 클라스를 상속받는 클라스는 무조건 abstract method를 구현해야 함! 그렇지 않으면 상속받는 클라스도 추상 클라스가 돼버려.
	
	/* 추상을 안쓰면 아래처럼 해야 함.
	public double area(){
	return 0;
	}
	*/

}
