
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();	//����Ʈ ��ü ���� �� ���ۼ��� p�� ����
		
		//��ü�� �ʵ� ����
//		p.x = 1.0;
//		p.y = 1.0;
	
		double temp = 1.0;
		
		p.setX(temp);	//�����ڸ� ����� �ʵ尪 ����
		System.out.println("temp= " + temp);
		p.setY(temp);
//		System.out.println(p.distance());	//p ��ü�� �Ÿ�(distance) ���
		System.out.println(p.getX());
	}

}
