
public class TestCar {

	public static void main(String[] args) {
	//이 메인문이 왜 static일까? -> static method
	//메소드를 호출하기 위해서는 원래 반드시 그 전에 객체를 생성해야 해. 그래야 객체에 대해서 메소드를 호출할 수 있어.
	//가끔, 객체 없이도 메소드를 호출할 필요가 있어(C언어의 함수를 사용하는 것처럼)
	//-> static method!!
	//객체를 생성하지 않고 사용할 수 있는 메소드
		System.out.println(Math.cos(0));
		//cos()라는 메소드를 사용하기 전에, Math클래스의 객체를 따로 만들지 않았어. -> static method
		
		Car myCar = new Car("black", 100);
		System.out.println(myCar.numberOfCars);
		//Car뒤에 계속, 굳이 ()가 있던 이유는, Constructor로 설명 가능해
		//어떤 클라스의 객체를 생성함과 동시에 constructor라는 메소드를 실행시켜.
		//맨 처음 객체를 생성할 때 값을 정해줄 수 있어! 그러면 다음과 같이 일일히 필드 설정할 필요 없어
		//myCar.setColor("black");
		//myCar.setSpeed(100);
		
		//Car yourCar = new Car();
		//이런 식으로 constructor를 만들었음에도 ()안에 아무것도 안쓰면? -> 에러
		//constructor를 만들기 전에는 java에서 알아서 빈 공간 넣어도 되도록 해줘~
		//만약 constructor 만든 후에도 빈 공간 쓰고 싶으면? 따로 빈 공간 넣어도 되는 constructor를 만들어야 함.
		//만약 생성자를 정의하지 않으면 매개변수 없는 생성자(디폴트 생성자)를 자바에서 자동으로 생성해준다.
		//하지만, 생성자를 하나라도 정의하면 자바는 아무 일도 안한다.
		//따라서 매개변수 없는 생성자까지 다 프로그래머가 책임지고 만들어야 한다.
		//생성자 주로 언제 써? 아예 기본값을 넣고 싶을 때.
		Car yourCar = new Car();
		
		System.out.println(myCar.numberOfCars);
		System.out.println(yourCar.numberOfCars);
		System.out.println(Car.numberOfCars);
		//static변수는 클라스 내에서 공유하므로 클라스를 통해서 접근할 수 있다.
		
		System.out.println(myCar);
		//reference의 toString Method를 알아서 불러서, 그 반환되는 String을 출력
		
		//Static Method 실행해보기
		Car.print();
	}

}
