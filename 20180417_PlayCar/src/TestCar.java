
public class TestCar {

	public static void main(String[] args) {
	//�� ���ι��� �� static�ϱ�? -> static method
	//�޼ҵ带 ȣ���ϱ� ���ؼ��� ���� �ݵ�� �� ���� ��ü�� �����ؾ� ��. �׷��� ��ü�� ���ؼ� �޼ҵ带 ȣ���� �� �־�.
	//����, ��ü ���̵� �޼ҵ带 ȣ���� �ʿ䰡 �־�(C����� �Լ��� ����ϴ� ��ó��)
	//-> static method!!
	//��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		System.out.println(Math.cos(0));
		//cos()��� �޼ҵ带 ����ϱ� ����, MathŬ������ ��ü�� ���� ������ �ʾҾ�. -> static method
		
		Car myCar = new Car("black", 100);
		System.out.println(myCar.numberOfCars);
		//Car�ڿ� ���, ���� ()�� �ִ� ������, Constructor�� ���� ������
		//� Ŭ���� ��ü�� �����԰� ���ÿ� constructor��� �޼ҵ带 �������.
		//�� ó�� ��ü�� ������ �� ���� ������ �� �־�! �׷��� ������ ���� ������ �ʵ� ������ �ʿ� ����
		//myCar.setColor("black");
		//myCar.setSpeed(100);
		
		//Car yourCar = new Car();
		//�̷� ������ constructor�� ����������� ()�ȿ� �ƹ��͵� �Ⱦ���? -> ����
		//constructor�� ����� ������ java���� �˾Ƽ� �� ���� �־ �ǵ��� ����~
		//���� constructor ���� �Ŀ��� �� ���� ���� ������? ���� �� ���� �־ �Ǵ� constructor�� ������ ��.
		//���� �����ڸ� �������� ������ �Ű����� ���� ������(����Ʈ ������)�� �ڹٿ��� �ڵ����� �������ش�.
		//������, �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ� �ϵ� ���Ѵ�.
		//���� �Ű����� ���� �����ڱ��� �� ���α׷��Ӱ� å������ ������ �Ѵ�.
		//������ �ַ� ���� ��? �ƿ� �⺻���� �ְ� ���� ��.
		Car yourCar = new Car();
		
		System.out.println(myCar.numberOfCars);
		System.out.println(yourCar.numberOfCars);
		System.out.println(Car.numberOfCars);
		//static������ Ŭ�� ������ �����ϹǷ� Ŭ�󽺸� ���ؼ� ������ �� �ִ�.
		
		System.out.println(myCar);
		//reference�� toString Method�� �˾Ƽ� �ҷ���, �� ��ȯ�Ǵ� String�� ���
		
		//Static Method �����غ���
		Car.print();
	}

}
