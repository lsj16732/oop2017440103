
public class Loop {

	public static void main(String[] args) {
		//1~10 ������ ȭ�鿡 ���
		int i;	//i�� ��������
		i=1;	//1. �������� �ʱ�ȭ
		while(i<=10) {	//2. ���� ���ǽ�
			System.out.println(i);	//3.������
			i++;	//4. ���� ���� ��ȭ
		}
		
		//1~10 ������ �����ְ� �� ���� ���
		int sum = 0;
		i = 0;	//1. �������� �ʱ�ȭ
		while(i<=10) {	//2. ���� ���ǽ�
			sum=sum+i;	//3. ���� ���ǹ�
			i++;	//4. ���� ���� ��ȭ
		}
		System.out.println("Sum = " + sum);
		
		//���� while���� for������ ǥ��
		sum=0;
		for(i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("sum = " + sum);
		
		//continue�� ����. ���ǽ����� ���ư���.
		String s = "no news is good news";
		int n = 0;
		for(i = 0; i<s.length(); i++) {	//length�� �޼ҵ���. ���� ��Ÿ����.
			if(s.charAt(i) != 'n')	//charAt�� �޼ҵ�. i��° ����. C���ٸ� �޼ҵ尡 ��� ��û ���������ٵ�.. �޼ҵ� �� �˾ƾ� ��.
				continue;	//���ǽ����� ���ư�. ���� i��° ���ڰ� n�� �ƴϸ� n���� ������ �ʰ� �ٽ� �������� ���ư���.
			n++;	//���� i��° ���ڰ� n�̸� n���� 1 ���Ѵ�.
		}
		System.out.println("���忡�� �߰ߵ� n�� ����= "+n);
		
		System.out.println("==========���α׷� ����==========");
	}

}
