import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;

		Scanner input = new Scanner(System.in);	//������ ����
		System.out.print("ù��° ������ �Է��ϼ���: ");
		a = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		b = input.nextInt();//Ű���忡�� ���� �Է�

		if(a>b) {
			System.out.println("�� ū ������ " + a+"�Դϴ�.");
		}
		else {
			System.out.println("�� ū ������ " + b+"�Դϴ�.");
		}
		System.out.println("=====���α׷� ����=====");
	}

}
