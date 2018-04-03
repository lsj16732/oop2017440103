
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);	//str1와 str2는 각각 String의 전화번호를 가지고 있어. 따라서 그 값은 달라.
		
		str1 = str2;	//str1의 전화번호를 없애고 str2의 전화번호를 입력 -> 원래의 str1의 전화번호는 더 이상 찾을 수 없어. 못찾는 그 객체는 JVM이 알아서 청소해줘.(garbage collection)
		System.out.println(str1==str2);	//두 변수가 똑같은 객체를 참조.
	}

}
