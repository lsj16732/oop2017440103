import java.util.Scanner;

public class HW_2_11 {

	public static void main(String[] args) {
		// �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//8 => 2 4 
		//12 => 2 3 4 6
		//���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		int num=1;
		int i;
		while(num!=0) {
			Scanner input = new Scanner (System.in);
			System.out.print("������ �Է��ϼ���.: ");
			num=input.nextInt();

			i=2;
			while(i<num) {
				if(num%i==0) {
					System.out.println(i);
				}
				i++;
			}
		}
		System.out.println("=====���α׷� ����=====");
		
	}

}
