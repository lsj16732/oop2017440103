import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class MyFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//this������ �ʵ�
	JButton button, btn;	//button�� �ʵ�ȭ��Ű�� ��� �޼ҵ忡�� ���� ����
	JTextField tf;
	
	MyFrame(){	//������
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SJ Frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout());//�÷ο��ġ�Ŵ������
		
		button = new JButton("Button");	//��ư ��ü ����
		this.add(this.button);	//��ư ��ü�� �����ӿ� �߰�
		this.button.setActionCommand("button1");
		button.addActionListener(this);//�̺�Ʈ������ ��ü ���
		
		btn = new JButton("�ι�° ��ư");
		this.add(this.btn);
		this.btn.setActionCommand("button2");
		btn.addAncestorListener((AncestorListener) this);//�̺�Ʈ������ ��ü ���
		
		tf=new JTextField(20);
		this.add(tf);
		
		setVisible(true);
		
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {	//�߻� �޼ҵ��� ������ �ݵ�� �ϼ������ ��!
			
			if(e.getActionCommand().equals("button1"))
				this.tf.setText("ù��° ��ư");
			else
				this.tf.setText("�ι�° ��ư");
		}
}
