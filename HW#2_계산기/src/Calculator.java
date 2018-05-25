import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	
	//Field
	//��ư: 0~9, C, +, =
	private JButton b0 = new JButton("0");
	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");
	private JButton bc = new JButton("C");
	private JButton bp = new JButton("+");
	private JButton be = new JButton("=");
	//�ؽ�Ʈ�ʵ�
	private JTextField tf = new JTextField(20);
	//Panel
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	//����
	private int n=0;
	private int n1=0;//ù��° ���� ����
	private int s=0;//�հ� ����
	
	//Constructor
	public Calculator() {
		//������ ����
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		//�÷ο� ��ġ �Ŵ���
		setLayout(new FlowLayout());
		
		//�гο� ������Ʈ �߰�
		//9 8 7
		p1.add(b9);
		p1.add(b8);
		p1.add(b7);
		//6 5 4
		p2.add(b6);
		p2.add(b5);
		p2.add(b4);
		//3 2 1 0
		p3.add(b3);
		p3.add(b2);
		p3.add(b1);
		p3.add(b0);
		//C + =
		p4.add(bc);
		p4.add(bp);
		p4.add(be);
		
		//�����ӿ� ������Ʈ �߰�
		add(tf);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		//�̺�Ʈ������ ��ü ���
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bc.addActionListener(this);
		bp.addActionListener(this);
		be.addActionListener(this);
		
		//â�� ������ ����
		setVisible(true);
		
	}

	//Abstract Method
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//�� ��ư�� ������ ���� �Է��� �� ����.
		if(e.getSource()==b0)
		{
			n=n*10+0;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b1)
		{
			n=n*10+1;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b2)
		{
			n=n*10+2;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b3)
		{
			n=n*10+3;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b4)
		{
			n=n*10+4;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b5)
		{
			n=n*10+5;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b6)
		{
			n=n*10+6;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b7)
		{
			n=n*10+7;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b8)
		{
			n=n*10+8;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==b9)
		{
			n=n*10+9;
			tf.setText(String.valueOf(n));
		}
		if(e.getSource()==bp)
		{
			n1 = n;
			n=0;
			tf.setText(null);
		}
		if(e.getSource()==be)
		{
			s=n1+n;
			n=0;
			tf.setText(String.valueOf(s));
		}
		if(e.getSource()==bc)
		{
			n=0;
			n1=0;
			s=0;
			tf.setText(String.valueOf(n));
		}
		
		
	}

}
