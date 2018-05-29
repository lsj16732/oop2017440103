import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyCalculator extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//Field
	private Integer operand1;//Integer는 Reference type, int는 primative type 즉, 객체를 생성하는 것!
	private Integer operand2;
	private Integer operand3;
	
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonC;
	private JButton buttonP;
	private JButton buttonE;
	private JTextField calcTextfield;
	
	
	//Constructor
	public MyCalculator() {
		
		//연산자 초기화
		operand1 = 0;
		operand2 = 0;
		operand3 = 0;
		
		//프레임 초기화
		setSize(200,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Calculator");
		
		setLayout(new FlowLayout());
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonC = new JButton("C");
		buttonP = new JButton("+");
		buttonE = new JButton("=");
		calcTextfield = new JTextField(10);
		
		
		//버튼 액션리스터 추가
		button0.setActionCommand("0");
		button1.setActionCommand("1");
		button2.setActionCommand("2");
		button3.setActionCommand("3");
		button4.setActionCommand("4");
		button5.setActionCommand("5");
		button6.setActionCommand("6");
		button7.setActionCommand("7");
		button8.setActionCommand("8");
		button9.setActionCommand("9");
		buttonC.setActionCommand("C");
		buttonP.setActionCommand("+");
		buttonE.setActionCommand("=");
		
		//버튼의 액션리스너 등록
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonC.addActionListener(this);
		buttonP.addActionListener(this);
		buttonE.addActionListener(this);
		
		
		
		//Frame에 JComponent 추가
		add(calcTextfield);
		add(buttonE);
		add(button9);
		add(button8);
		add(button7);
		add(button6);
		add(button5);
		add(button4);
		add(button3);
		add(button2);
		add(button1);
		add(buttonC);
		add(button0);
		add(buttonP);
		
		setVisible(true);
		
	}
	
	
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
	
	private String calculating(String text) {
		String[] tokens = text.split("\\+");
		operand1 = Integer.parseInt(tokens[0]);
		operand2 = Integer.parseInt(tokens[1]);
		return Integer.toString(operand1+operand2);
	}

	public static void main(String[] args) {
		MyCalculator MyCalculator = new MyCalculator();

	}

}
