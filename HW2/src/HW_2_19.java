import java.util.Scanner;

public class HW_2_19 {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int input_num;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.: ");
		input_num=input.nextInt();
		int i=1;
		int count=0;
		while(i<=input_num) {
			if(input_num%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("�Ҽ��Դϴ�.");
		}
		else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		System.out.println("=====���α׷� ����=====");
			
			
		
	}

}