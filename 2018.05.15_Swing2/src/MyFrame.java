import java.awt.FlowLayout;

import javax.swing.*;
//프레임 만드는 두번째 방법: JFrame으로부터 상속받은 클래스를 만든다.
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Lee's 2nd frame");
		
		
		//새로운 컴포넌트를 프레임에 추가
		this.setLayout(new FlowLayout());	//플로우 배치 매니저 사용
		//FlowLayout은 프레임에 컴포넌트를 배치하는 여러 방법 중 하나. 쭉 나열해줘
		
		//중요한건, setLayout 속에 클라스 이름이 아닌 객체를 넣어줘야 함!
		JLabel label = new JLabel("안녕하세요 반갑습니다.");	//레이블 객체 생성
		JTextField tf = new JTextField(20);//텍스트필드 객체 생성
		JButton button = new JButton("Lee's button");	//버튼 객체 생성
		
		button.setText("이승주");//버튼의 이름을 바꿔줘
		tf.setText("축제를 즐기고 싶어요ㅠ");	//텍스트 박스의 글자를 채워줌
		
		//패널 생성: 두 컴포넌트를 하나의 컴포넌트처럼 묶어줘.
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		this.add(button);	//버튼 객체를 프레임에 추가
//		this.add(label);//레이블 객체를 프레임에 추가
//		this.add(tf);//텍스트필드 객체를 프레임에 추가
		//add하는 순서가 중요함. 순서대로 나타나~~ 왜? setLayout에서 FlowLayout방법을 사용했기 때문.
		this.add(panel);
		
//		this.pack();	//컴포넌트 사이즈에 맞게 프레임 사이즈 조절해주는 컴포넌트
		
		
		this.setVisible(true);
	}

}
