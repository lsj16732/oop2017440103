
public class HW_2_5 {

	public static void main(String[] args) {
		//1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do-while�� ���)
		int i=3;
		int sum=0;
		do {
			sum=sum+i;
			i=i+3;
		} while(i<=100);
		System.out.println(sum);
		System.out.println("=====���α׷� ����=====");
	}

}