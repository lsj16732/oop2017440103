import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;
		char b;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. =");
		a = input.nextInt();//Ű���忡�� ���� �Է�
		if(a>=80)
			b='A';
		else if(a>=60)
			b='B';
		else if(a>=40)
			b='C';
		else if(a>=20)
			b='D';
		else
			b='F';
		
		System.out.println("����� �����"+b+"�Դϴ�.");
		System.out.println("=====���α׷� ����=====");
		
		}
	}
