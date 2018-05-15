import java.awt.FlowLayout;

import javax.swing.*;
//������ ����� �ι�° ���: JFrame���κ��� ��ӹ��� Ŭ������ �����.
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Lee's 2nd frame");
		
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		this.setLayout(new FlowLayout());	//�÷ο� ��ġ �Ŵ��� ���
		//FlowLayout�� �����ӿ� ������Ʈ�� ��ġ�ϴ� ���� ��� �� �ϳ�. �� ��������
		
		//�߿��Ѱ�, setLayout �ӿ� Ŭ�� �̸��� �ƴ� ��ü�� �־���� ��!
		JLabel label = new JLabel("�ȳ��ϼ��� �ݰ����ϴ�.");	//���̺� ��ü ����
		JTextField tf = new JTextField(20);//�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("Lee's button");	//��ư ��ü ����
		
		button.setText("�̽���");//��ư�� �̸��� �ٲ���
		tf.setText("������ ���� �;���");	//�ؽ�Ʈ �ڽ��� ���ڸ� ä����
		
		//�г� ����: �� ������Ʈ�� �ϳ��� ������Ʈó�� ������.
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		this.add(button);	//��ư ��ü�� �����ӿ� �߰�
//		this.add(label);//���̺� ��ü�� �����ӿ� �߰�
//		this.add(tf);//�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		//add�ϴ� ������ �߿���. ������� ��Ÿ��~~ ��? setLayout���� FlowLayout����� ����߱� ����.
		this.add(panel);
		
//		this.pack();	//������Ʈ ����� �°� ������ ������ �������ִ� ������Ʈ
		
		
		this.setVisible(true);
	}

}
