
public class Dog extends Animal {
//extends animal -> animal의 모든 것을 dog가 상속받았어.
	public Dog(String name) {
		super(name);
	}
	
	//상속받은거에서 약간 바꾸고 싶어. 똑같은 이름으로 메소드 하나 더 만들면 돼.
	//Overriding: 상속받을 때 부모로부터 받는 메소드를 거부하고 같은 이름의 메소드를 새로 만드는 것.
	@Override //내가 진짜로 overloading이 아니라 overriding을 하는 것임을 java 컴파일러한테 알려주는 표시.
	public void sing() {
		System.out.println(name+"멍멍");
	}

}
