
public class TestString {

	public static void main(String[] args) {
		int a = 10;	//int형의 변수 a 생성 + 값 10을 a에 저장
		//string 객체 생성
		String str;	//클라스 스트링을 참조할 수 있는 참조 변수(레퍼런스 변수) 생성
		//여기서 String은 클라스의 이름이다.
		//자바에서는 변수(자료형)를 크게 두 가지로 나눌 수 있다.
		//1. 원시변수(자료형)(primitive) : 위의 a가 원시 변수의 예시. C에서부터 있는 것.
		//2. 참조변수(자료형)(reference)
		str = new String("Hello darkness my old friend.");	//객체 생성
		//메모리에 String이라는 클래스의 객체를 만드는 것. "Hello~"가 그 안에 들어가있어. C의 포인터랑 같은 것.
		
		//String 객체의 길이
		//메소드 호출 방법: 참조 변수.메소드()ㅣ
		int length = str.length();
		System.out.println("string length is "+length);
		
		String str1;//새로운 참조변수를 만들어.
		str1=str.toUpperCase();//새로운 객체를 만들어.
		System.out.println("str1: "+str1);
	}

}
