import java.util.Scanner;

public class HW_2_7 {

	public static void main(String[] args) {
		//0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		int a=1;
		int sum=0;
		while(a!=0) {
			Scanner input = new Scanner(System.in);	//������ ����
			System.out.print("���� �Է��ϼ���. :");
			a = input.nextInt();//Ű���忡�� ���� �Է�
			sum=sum+a;
		}
		
		System.out.println(sum);
		System.out.println("=====���α׷� ����=====");
		}

		

	}


