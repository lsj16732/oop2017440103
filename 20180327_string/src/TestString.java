
public class TestString {

	public static void main(String[] args) {
		int a = 10;	//int���� ���� a ���� + �� 10�� a�� ����
		//string ��ü ����
		String str;	//Ŭ�� ��Ʈ���� ������ �� �ִ� ���� ����(���۷��� ����) ����
		//���⼭ String�� Ŭ���� �̸��̴�.
		//�ڹٿ����� ������ ũ�� �� ������ ���� �� �ִ�.
		//1. ���ú���(primitive) : ���� a�� ���� ������ ����. C�������� �ִ� ��.
		//2. ��������(reference)
		str = new String("Hello darkness my old friend.");	//��ü ����
		//�޸𸮿� String�̶�� Ŭ������ ��ü�� ����� ��. "Hello~"�� �� �ȿ� ���־�. C�� �����Ͷ� ���� ��.
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ���� ����.�޼ҵ�()
		int length = str.length();
		System.out.println("string length is "+length);
		
		String str1;//���ο� ���������� �����.
		str1=str.toUpperCase();//���ο� ��ü�� �����.
		System.out.println("str1: "+str1);
	}

}