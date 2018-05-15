import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//첫 번째 이벤트리스터클라스 구현 방법
public class MyListener implements ActionListener{	//인터페이스 구현

	@Override
	public void actionPerformed(ActionEvent arg0) {	//추상 메소드의 몸통을 반드시 완성해줘야 함!
		System.out.println("버튼이 눌려졌어요");
		//액션 이벤트 객체에서 눌려진 버튼 객체를 (버튼 객체의 레퍼런스값) 가져온다.
		JButton button = (JButton) arg0.getSource();
		button.setText("버튼이 눌려졌어요!!");
	}

}