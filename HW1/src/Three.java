import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ���. =");
		a = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("�ι�° ������ �Է��ϼ���. =");
		b = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("����° ������ �Է��ϼ���. =");
		c = input.nextInt();//Ű���忡�� ���� �Է�
		
		if(a>b) {
			if(a>c) {
				System.out.println("���� ū ������ =" + a);
			}
			else
			{
				System.out.println("���� ū ������ =" + c);
			}
		}
		else {
			if(b>c) {
				System.out.println("���� ū ������ =" + b);
			}
			else
			{
				System.out.println("���� ū ������ =" + c);
			}
		}
		System.out.println("=====���α׷� ����=====");
	}

}
