
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);	//str1�� str2�� ���� String�� ��ȭ��ȣ�� ������ �־�. ���� �� ���� �޶�.
		
		str1 = str2;	//str1�� ��ȭ��ȣ�� ���ְ� str2�� ��ȭ��ȣ�� �Է� -> ������ str1�� ��ȭ��ȣ�� �� �̻� ã�� �� ����. ��ã�� �� ��ü�� JVM�� �˾Ƽ� û������.(garbage collection)
		System.out.println(str1==str2);	//�� ������ �Ȱ��� ��ü�� ����.
	}

}
