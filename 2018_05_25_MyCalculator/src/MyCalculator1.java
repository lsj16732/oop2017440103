import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyCalculator1 extends JFrame {
	//�Լ��� �迭�� ����ؼ� �� �����ϰ� �����ڤ�.

	private JButton[] nButtons;//number buttons. 0~9
	private JButton buttonC;
	private JButton buttonP;
	private JButton buttonE;
	private JTextField calcTextfield;
	private MyCalculatorActionListener al;
	
	
	//Constructor
	public MyCalculator1() {
		
		//������ �ʱ�ȭ
		setSize(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Calculator");
		
		setLayout(new FlowLayout());
		al = new MyCalculatorActionListener();
		
		for(int i = 0; i<10; i++) {
			nButtons[i] = createNewButtonObjects(Integer.toString(i));
		}
		createNewButtonObjects("C");
		createNewButtonObjects("+");
		createNewButtonObjects("=");
		calcTextfield = new JTextField(10);
		add(calcTextfield);
		setVisible(true);
		
	}
		
	//��ư ��ü ����, �׼� Ŀ�ǵ� ����, �׼� ������ ���
	private JButton createNewButtonObjects(String name) {//private�ֽ�? �ܺο��� ����ϰ� ���� ��������.
		JButton button = new JButton(name);
		button.setActionCommand(name);
		button.addActionListener(al);
		add(button);
		return button;
	}
	
	private String calculating(String text) {
		String[] tokens = text.split("\\+");
		return Integer.toString(Integer.parseInt(tokens[0])+Integer.parseInt(tokens[1]));
	}
		
	

	public static void main(String[] args) {
		MyCalculator MyCalculator = new MyCalculator();

	}
	
	public class MyCalculatorActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "0" :
				calcTextfield.setText(calcTextfield.getText()+"0");
				break;
				
			case "1" :
				calcTextfield.setText(calcTextfield.getText()+"1");
				break;
				
			case "2" :
				calcTextfield.setText(calcTextfield.getText()+"2");
				break;
				
			case "3" :
				calcTextfield.setText(calcTextfield.getText()+"3");
				break;
				
			case "4" :
				calcTextfield.setText(calcTextfield.getText()+"4");
				break;
				
			case "5" :
				calcTextfield.setText(calcTextfield.getText()+"5");
				break;
				
			case "6" :
				calcTextfield.setText(calcTextfield.getText()+"6");
				break;
				
			case "7" :
				calcTextfield.setText(calcTextfield.getText()+"7");
				break;
				
			case "8" :
				calcTextfield.setText(calcTextfield.getText()+"8");
				break;
				
			case "9" :
				calcTextfield.setText(calcTextfield.getText()+"9");
				break;
				
			case "C" :
				calcTextfield.setText("");
				break;
				
			case "+" :
				calcTextfield.setText(calcTextfield.getText()+"+");
				break;
				
			case "=" :
				String result = calculating(calcTextfield.getText());
				calcTextfield.setText(calcTextfield.getText()+"="+result);
				break;
				
			}
			
		}

	}

}
