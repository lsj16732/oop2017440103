import javax.swing.JFrame;
//javax.swing은 패키지, JFrame은 클래스

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Lee's Frame");
		//프레임 생성
		f.setSize(900,500);
		//사이즈 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임의 X를 누르면 어떤 행동을 취할 지
		//JFrame은 클래스 이름, EXIT_ON_CLOSE: static variable(클래스의 모든 객체가 공유하는 변수). 메소드 아냐!! 모두 대문자이므로 상수임(final). 
		f.setVisible(true);
		//스크린 화면에 올려주는 메소드.
	}

}
