import java.util.Scanner;

public class HW_2_9 {

	public static void main(String[] args) {
		//  1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(5�̸� 5���� ���)
		// ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		int input_num=0;
		System.out.print("1~9 ������ ���� �Է��ϼ���. :");
		for(;;) {
			Scanner input = new Scanner(System.in);	//������ ����
			input_num = input.nextInt();//Ű���忡�� ���� �Է�
			if((input_num>=1)&&(input_num<=9)){
				break;
			}
			System.out.print("Error. 1~9 ���� ���ڸ� �ٽ� �Է��ϼ���.:");
		}
		int i=1;
		while(i<=10) {
			System.out.println(input_num*i);
			i=i+1;
		}
		System.out.println("=====���α׷� ����=====");
	}

}
