
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point();	//클라스 Point의 새로운 객체 pnt1 선언
		//좌변에 의해 메모리 어딘가 변수를 위한 공간이 만들어진다. 그 공간의 이름은 pnt1이고, 그 안에 reference값이 존재
		//우변에 의해 Point클라스의(=Point 모양의! x의 메모리 있고, y의 메모리 있고 ...) 새로운 instance(객체)가 메모리에 생성된다.
		//reference값이 instance를 가르킨다. (전화번호!!)
		//클라스는 와플 기계(틀), 객체는 따끈따끈한 와플!
		
		pnt1.setX(1.0);//x값 설정
		//객체 pnt1의 필드 x의 값을 setX메소드를 통해 설정해준다.
		pnt1.setY(1.0);//y값 설정
		//객체 pnt1의 필드 y의 값을 setY메소드를 통해 설정해준다.
		pnt1.print();
		
		Point pnt2 = new Point();
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		pnt2.print();
		
		
		
		String str = pnt1.toString();
		System.out.println(str);
		System.out.println(pnt1);
		//가급적이면 println()안에는 String이 있어야 함. 그런데 String이 아니면 println()메소드가 알아서 어셉트를 한다. String이 아니면 이 객체의 toString이라는 이름의 메소드를 불러오도록 약속한 것. 따라서 단순히 객체만 넣었음에도 불구하고 메소드가 실행돼서 좌표가 출력된 것~ 
		//println메소드는 ()내부가 String이 아니면 알아서 toString을 불러와서 return된 String값을 출력
		
		
		//중복 메소드(Overloading Method)
		//메소드의 이름은 같은데, 매개변수에 따라서 두 메소드 중 하나를 선택해서 불러옴.
		//메소드 이름은 동일하지만, 매개변수로 호출할 메소드를 구분할 수 있다.
		System.out.println(pnt2.distance());
		//원점으로부터의 거리를 출력해준다.
		System.out.println(pnt2.distance(pnt1));
		//pnt1부터 pnt2까지의 거리를 출력해준다.
	}

}
