
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();	//포인트 객체 생성 및 레퍼선스 p에 저장
		
		//객체의 필드 접근
//		p.x = 1.0;
//		p.y = 1.0;
	
		double temp = 1.0;
		
		p.setX(temp);	//접근자를 사용한 필드값 설정
		System.out.println("temp= " + temp);
		p.setY(temp);
//		System.out.println(p.distance());	//p 객체의 거리(distance) 출력
		System.out.println(p.getX());
	}

}
