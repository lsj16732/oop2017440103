import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//ù ��° �̺�Ʈ������Ŭ�� ���� ���
public class MyListener implements ActionListener{	//�������̽� ����

	@Override
	public void actionPerformed(ActionEvent arg0) {	//�߻� �޼ҵ��� ������ �ݵ�� �ϼ������ ��!
		System.out.println("��ư�� ���������");
		//�׼� �̺�Ʈ ��ü���� ������ ��ư ��ü�� (��ư ��ü�� ���۷�����) �����´�.
		JButton button = (JButton) arg0.getSource();
		button.setText("��ư�� ���������!!");
	}

}