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
		setTitle("이벤트");
		setLayout(new FlowLayout());
		button = new JButton("누르세요");
		button.addActionListener(this);
		label = new JLabel("아직 버튼이 눌려지지 않았다.");
		panel.add(button);
		panel.add(label);
		add(panel);
		setVisible(true);
		
	}
/*	
	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			button.setText("버튼이 눌렸다.");
			label.setText("눌렸대");
		}

	}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
			label.setText("버튼눌림");
		
	}
}
