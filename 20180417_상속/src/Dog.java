
public class Dog extends Animal {
//extends animal -> animal�� ��� ���� dog�� ��ӹ޾Ҿ�.
	public Dog(String name) {
		super(name);
	}
	
	//��ӹ����ſ��� �ణ �ٲٰ� �;�. �Ȱ��� �̸����� �޼ҵ� �ϳ� �� ����� ��.
	//Overriding: ��ӹ��� �� �θ�κ��� �޴� �޼ҵ带 �ź��ϰ� ���� �̸��� �޼ҵ带 ���� ����� ��.
	@Override //���� ��¥�� overloading�� �ƴ϶� overriding�� �ϴ� ������ java �����Ϸ����� �˷��ִ� ǥ��.
	public void sing() {
		System.out.println(name+"�۸�");
	}

}
