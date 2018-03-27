
public class RememberC {

	public static void main(String[] args) {	//class���� main���� �ݵ�� �ʿ��ϴ�.
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");	//println�� ln�� ���Ͷ�� �ǹ�
		//�� Hello World ����� ���� ���� Java Application�� �����ϴ� ���̴�.
		
		
		//����: �޸� ��������� �̸�. 4bite�� ���� ���ļ� a��� �θ��ڴ�.
		/* �ڷ���:
		 	1. ������ ���� �� �ִ� ���� ������ ���Ѵ�.
		 	2. ������ �ǿ����ڷ� ����� ���, ����� �� �ִ� �����ڸ� ���Ѵ�.
		 	3. ���� �޸𸮿� �����ϱ� ���� �ʿ��� ����(��������� ��, ���� ����)�� ���Ѵ�.
		 */
		/* ���� ����:
		 	1. ����� ������ �̸��� �����Ѵ�.
		 	2. ����� ������ �ڷ����� �����Ѵ�.
		 	3. C������ ���������� Java������ ������ ����ϱ� ���� �ݵ�� ���� ������ �ؾ� �Ѵ�.
		 */
		int a;	//���� ����. 1. ������ �̸��� a�̴�. 2. ���� a�� �ڷ����� int�̴�.
		int b,c,d;
		
		
		//���ͷ�(literal, ���): �ҽ��ڵ忡�� ���� ǥ���ϴ� ���. �ϳ��� ���� ǥ���ϴ� ����� �پ��� �� ����. ���� �ƹ��͵� ���� ǥ���ϴ� ���� 10������ ǥ���� ��.
		//<��> a = 0x10; �̴� 16������ 16�� ǥ���� ��.
		//������: ������ ���� ��ȣ (+.-./,*,&,| ���...)
		//���Կ�����(=): �캯�� ���� �º��� ����ҷ� �̵��Ѵ�. �캯�� ���� ��ȯ�Ѵ�.
		// <��1> 10 = a; �̰� �� ������ ����? �º��� ����Ұ� �ƴ� ���� ����ֱ� �����̴�.
		// <��2> a = a; �� �º��� �캯�� �ٸ� ���̴�. �º��� ����� a, �캯�� �� a.
		//����(expression): �����ڿ� �ǿ�����(���ͷ�, ����, ����)���� ����. ��� ������ ���� ��ȯ(����)�Ѵ�.
		//<��> a = a * 10 + 20;
		a = 10;	
		a = a * 10 + 20;
		
		
		//�μ�ȿ��(side effect): ������ ���� ��ȯ�ϴ� �� �̿� �����ϴ� ��� �۾��� �μ�ȿ���� �Ѵ�.
		//post increment(a++): ��ȯ���� a, �μ�ȿ���� a=a+1;
		b = a++;	//a�� ���� ��ȯ�ؼ� b�� �� ���� �ְ�, a�� +1�� �ȴ�.
		//pre increment(++a): ��ȯ���� a+1. �μ�ȿ���� a=a+1;
		c=10;
		d=++c;
		
		System.out.println("a = "+a + "	b= "+b);
		System.out.println("c = "+c + "	d= "+d);
		//"a = "�� ���ڿ� +�� ������ a�� ����
		//+�� �� ����?? a�� ������ ���� ���ڿ��� ��ȯ�ؼ� ���� ���ڿ� �ڿ� �߰��Ѵٴ� ��! -> "a = 10"�̶�� �ϳ��� ���ڿ��� ��.
		System.out.println("Helllllllo " + "there");	//�̷� ������ ���ڿ��� ��ĥ �� �־�.
		
		
		//java�� �ο� �ڷ����� true/false ���ͷ��� ����Ѵ�.
		//����������(||, &&)�� �ǿ����ڴ� �ο� ���� �Ǵ� ���ͷ��� ����ؾ� �Ѵ�.
		boolean bb;
		boolean cc;
		bb = true;
		cc = false;
		System.out.println("bb= " + bb);
		System.out.println("cc= " +cc);
		
		//���迬����(>,<,<=,>=,++,!=)�� ��ȯ���� �ݵ�� true/false
		bb= true || false;
		boolean dd;
		System.out.println("dd= "+ (0>1));
		System.out.println("bb= "+bb);
		
		
		//C���� ��� �����ϰ� ������ const�� ��µ� java������ final�� ����. �ѹ� �����ϸ� ���� �ٲ� �� ����.
		final int i = 100;
		//i = 1000;
		//�̹� final�� ����� �����߱� ������ ������ �ּ��� �����ϸ� ������ ���� �߻�.
		System.out.println("i= "+i);
		
		
		//�Ҽ��� �ڷ��� (float, double)
		float ff;
		double ddd;
		ff = 3.14f;
		ddd = 3.14;	//���ͷ� 3.14�� �ڷ����� double�̴�.
		System.out.println("ff= "+ff + " ddd= "+ddd);
		
		
		//����ȯ (casting): "������, �����" �ڷ������� ��ȯ�Ѵ�.
		int x = 10;
		double y=100.34;
		y = x;	//implicit casting �˾Ƽ� y�� �ڷ����� double���� int�� �ٲ��� ��. y=(double) x; ����ص� ��.
		//x = y; int�� �Ҽ��� �Ʒ��� ǥ���� �� �����Ƿ� implicit casting�� �ȵ�.
		//C���ٸ� ���Ը� �߰� �˾Ƽ� ĳ�����������ٵ�, �ڹٴ� �׷��� ����.
		x = (int) y; //explicit casting. ������ ĳ�������ִ� ��.
		
		System.out.println("x= "+x+" y= "+y);
		
		
	}
}