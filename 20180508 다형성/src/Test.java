import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
		
//		tina.eat();
		//aaa.eat(); error
		
		//�캯�� Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ��������. �º� <--�캯
		//Upcasting
		//Animal aaa = new Dog();
		Animal aaa = (Animal)new Dog();
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 �����Ѵ�.
		//aaa.sing();
		//������(polymorphism)
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. SuperClass superRefVar = new Subclass();
		//4. superRefVar.overMethod() -> ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�.
		
		
		//aaa = new Cat();
		//aaa.sing();
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("Dog"))
			aaa = new Dog();
		else
			aaa = new Cat();
		aaa.sing(); //���� ���ε�(Dynamic Binding) : ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		//� �޼ҵ带 ���������� ������ �� ���� �ƴ� ��Ÿ�Ӷ� ������. ������!
		
		//int a;
		//a = (int) 3.1; //����ȯ (type casting)
		
		//�߻� Ŭ���� ��ü�� ���� �� ����.
		//aaa = new Animal();
	}

}
