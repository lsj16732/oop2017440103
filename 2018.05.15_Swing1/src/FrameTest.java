import javax.swing.JFrame;
//javax.swing�� ��Ű��, JFrame�� Ŭ����

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Lee's Frame");
		//������ ����
		f.setSize(900,500);
		//������ ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�������� X�� ������ � �ൿ�� ���� ��
		//JFrame�� Ŭ���� �̸�, EXIT_ON_CLOSE: static variable(Ŭ������ ��� ��ü�� �����ϴ� ����). �޼ҵ� �Ƴ�!! ��� �빮���̹Ƿ� �����(final). 
		f.setVisible(true);
		//��ũ�� ȭ�鿡 �÷��ִ� �޼ҵ�.
	}

}
