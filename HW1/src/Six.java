import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
/*6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
����� �Է� : �� ���� �� �ڸ� ����
��� : �ڸ����� ������ �ݴ�� �� ����*/
		int number;
		int reverse_number;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� ������ �Է��ϼ���. =");
		number = input.nextInt();
		if((number%10)==0) {
			reverse_number=number/10;
		}
		else {
			reverse_number=(number%10)*10+number/10;
		}
		System.out.println(reverse_number);
		System.out.println("=====���α׷� ����=====");
	}
}
