import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

	private JButton button;
	private JLabel label;
	public MyFrame() {
		JPanel panel = new JPanel();
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�̺�Ʈ");
		setLayout(new FlowLayout());
		button = new JButton("��������");
		button.addActionListener(this);
		label = new JLabel("���� ��ư�� �������� �ʾҴ�.");
		panel.add(button);
		panel.add(label);
		add(panel);
		setVisible(true);
		
	}
/*	
	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			button.setText("��ư�� ���ȴ�.");
			label.setText("���ȴ�");
		}

	}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
			label.setText("��ư����");
		
	}
}
