import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// 2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. =");
		a = input.nextInt();//Ű���忡�� ���� �Է�
		
		b=a%2;
		if(b!=1) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println("=====���α׷� ����=====");
	}

}
