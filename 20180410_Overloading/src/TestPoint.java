
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point();	//Ŭ�� Point�� ���ο� ��ü pnt1 ����
		//�º��� ���� �޸� ��� ������ ���� ������ ���������. �� ������ �̸��� pnt1�̰�, �� �ȿ� reference���� ����
		//�캯�� ���� PointŬ����(=Point �����! x�� �޸� �ְ�, y�� �޸� �ְ� ...) ���ο� instance(��ü)�� �޸𸮿� �����ȴ�.
		//reference���� instance�� ����Ų��. (��ȭ��ȣ!!)
		//Ŭ�󽺴� ���� ���(Ʋ), ��ü�� ���������� ����!
		
		pnt1.setX(1.0);//x�� ����
		//��ü pnt1�� �ʵ� x�� ���� setX�޼ҵ带 ���� �������ش�.
		pnt1.setY(1.0);//y�� ����
		//��ü pnt1�� �ʵ� y�� ���� setY�޼ҵ带 ���� �������ش�.
		pnt1.print();
		
		Point pnt2 = new Point();
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		pnt2.print();
		
		
		
		String str = pnt1.toString();
		System.out.println(str);
		System.out.println(pnt1);
		//�������̸� println()�ȿ��� String�� �־�� ��. �׷��� String�� �ƴϸ� println()�޼ҵ尡 �˾Ƽ� ���Ʈ�� �Ѵ�. String�� �ƴϸ� �� ��ü�� toString�̶�� �̸��� �޼ҵ带 �ҷ������� ����� ��. ���� �ܼ��� ��ü�� �־������� �ұ��ϰ� �޼ҵ尡 ����ż� ��ǥ�� ��µ� ��~ 
		//println�޼ҵ�� ()���ΰ� String�� �ƴϸ� �˾Ƽ� toString�� �ҷ��ͼ� return�� String���� ���
		
		
		//�ߺ� �޼ҵ�(Overloading Method)
		//�޼ҵ��� �̸��� ������, �Ű������� ���� �� �޼ҵ� �� �ϳ��� �����ؼ� �ҷ���.
		//�޼ҵ� �̸��� ����������, �Ű������� ȣ���� �޼ҵ带 ������ �� �ִ�.
		System.out.println(pnt2.distance());
		//�������κ����� �Ÿ��� ������ش�.
		System.out.println(pnt2.distance(pnt1));
		//pnt1���� pnt2������ �Ÿ��� ������ش�.
	}

}
