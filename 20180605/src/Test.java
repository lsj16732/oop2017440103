
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");	//Upcasting
		Animal aCat = new Cat("����");	//Upcasting
		aDog.sing();
		aCat.sing();
		//error) aDog.playFetch(); Upcasting�ߴµ�, Animal���� playFetch�� ���� ����
		
		((Dog)aDog).playFetch();//Downcasting
		//error) ((Cat)aDog).playFetch();
		//Runtime Error. ((Dog)aCat).playFetch(); ������ �������� �������� �ƴ��� �˼�����. �����϶��� �� �� ����.

	}

}
