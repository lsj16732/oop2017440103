
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str);	//String을 집어 넣어도 Object로 Upcasting! Object와 String이 상속 관계. 아래것을 위쪽 타입으로 바꿔줘.
		//int: primitive type, Integer: reference type
		Integer i;
		//i = 3;
		i = new Integer(3);
		System.out.println(i);
		//i = 1+box.get();
		System.out.println("the box contain " + box.get());
		int a = 10;
		box.set(a);	//primitive type을 reference로 autoboxing
		System.out.println(10+(Integer)box.get());	//Integer + Object는 할 수 없어.

	}

}
