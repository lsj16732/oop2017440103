import java.util.Scanner;

public class HW_2_21 {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int input_num;
		int num=1;
		int i=1;
		int count=0;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.: ");
		input_num=input.nextInt();

		while(num<=input_num) {
			i=1;
			count=0;
			while(i<=num) {
				if(num%i==0) {
					count++;
				}
				i++;
			}
			if(count==2) {
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);
		System.out.println("=====���α׷� ����=====");
		
	}

}