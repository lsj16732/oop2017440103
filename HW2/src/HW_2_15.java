import java.util.Random;
import java.util.Scanner;

public class HW_2_15 {

	public static void main(String[] args) {
/*
1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)

��) ���� 49�� ���:

���ڸ� �Է��Ͻÿ�: 36
�Է��Ͻ� ���ں��� Ů�ϴ�.

���ڸ� �Է��Ͻÿ�: 51
�Է��Ͻ� ���ں��� �۽��ϴ�.

���ڸ� �Է��Ͻÿ�: 49
�����Դϴ�!
*/
		Random random=new Random();
		int random_num=random.nextInt(99)+1;
		int input_num;
		int count=0;	//������ ��
		int flag=0;	//����, ���� ������ ����
		while(count<10) {
			Scanner input = new Scanner(System.in);
			System.out.print("���ڸ� �Է��Ͻÿ�.: ");
			input_num=input.nextInt();
			
			if(random_num>input_num) {
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
			}
			else if(random_num<input_num) {
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
			}
			else {
				flag=1;
				break;
			}
			count++;
		}
		switch(flag){
			case 0:
				System.out.println("GAMEOVER");
				break;
			case 1:
				System.out.println("�����Դϴ�!");
		}
		System.out.println("=====���α׷� ����=====");
	}
}
		
		

