import java.util.Scanner;

public class HW_2_13 {

	public static void main(String[] args) {
		// month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		int month;
		int day;
		int sum=0;
		int i=2;
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Month�� �Է��ϼ���: ");
		month=input1.nextInt();
		Scanner input2 = new Scanner (System.in);
		System.out.print("Day�� �Է��ϼ���: ");
		day=input2.nextInt();
		
		while(i<=month) {
			switch(i) {
			case 2: case 4: case 6: case 8: case 9: case 11:
				sum=sum+31;
				break;
			case 3:
				sum=sum+28;
				break;
			case 5: case 7: case 10: case 12:
				sum=sum+30;
				break;
			}
			i++;
		}
		sum=sum+day;
		System.out.println(sum);
		System.out.println("=====���α׷� ����=====");
	}
}
