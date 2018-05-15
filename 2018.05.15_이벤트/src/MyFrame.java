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
	//this붙은건 필드
	JButton button, btn;	//button을 필드화시키면 모든 메소드에서 접근 가능
	JTextField tf;
	
	MyFrame(){	//생성자
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SJ Frame");
		
		//새로운 컴포넌트를 프레임에 추가
		setLayout(new FlowLayout());//플로우배치매니저사용
		
		button = new JButton("Button");	//버튼 객체 생성
		this.add(this.button);	//버튼 객체를 프레임에 추가
		this.button.setActionCommand("button1");
		button.addActionListener(this);//이벤트리스너 객체 등록
		
		btn = new JButton("두번째 버튼");
		this.add(this.btn);
		this.btn.setActionCommand("button2");
		btn.addAncestorListener((AncestorListener) this);//이벤트리스너 객체 등록
		
		tf=new JTextField(20);
		this.add(tf);
		
		setVisible(true);
		
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {	//추상 메소드의 몸통을 반드시 완성해줘야 함!
			
			if(e.getActionCommand().equals("button1"))
				this.tf.setText("첫번째 버튼");
			else
				this.tf.setText("두번째 버튼");
		}
}
