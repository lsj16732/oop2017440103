import java.util.Scanner;	//Scanner�� ���� ���� �ʿ�. Ű����� ���� �Է��� �� �ְ� ��

public class ConditionalStatement {

	public static void main(String[] args) {
		int score;
		int good = 0;
		System.out.print("������ �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);	//������ ����
		score = input.nextInt();//Ű���忡�� ���� �Է�
		System.out.println("������ " + score + " ���Դϴ�.");
		 
		//������ 60�� �̻��̸� "�հ��Դϴ�", 60�� �̸��̸� "���հ��Դϴ�"�� ���
		//�� >= : ���迬����
		// if(���ǽ�) {���� ��� ����} else {������ ��� ����}
		if(score>=60) {
			System.out.println("�հ��Դϴ�");
			good++;
		}	//�ϳ��� ���忡 ���� ������ ��. ���� ������ �߰�ȣ�� ���� �ϳ��� �������� ó��-> ���չ� (compound statement)
		else
			System.out.println("���հ��Դϴ�");
		//if���� else���� �� ����(���ǹ�)�̾�!!
		//Java�� ������ �ϳ��� �߰�ȣ ��� ��, ������ �������� �߰�ȣ �־�� ��
		 
		//������ 80�� �̻��̸� A, 60�� �̻��̸� B, 60�� �̸��̸� F�� ���
		if(score>=80)
			System.out.println("A");
		else if(score>=60)
			System.out.println("B");
		else
			System.out.println("F");
		
		//0->"����", 1->"�ϳ�", 2->"��", 0/1/2�� �ƴϸ� ->"����"�� ���
		switch (score) {
		case 0:
			System.out.println("����");
			break;	//break�� �� ����� switch������ Ż��Ȱ �� �־�. break�� ������ �Ʒ��� �� �����
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("����");
			break;
		}
		System.out.println("==========���α׷� ����==========");
		}
		
	}	

