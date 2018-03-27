import java.util.Random;
import java.util.Scanner;

public class HW_2_15 {

	public static void main(String[] args) {
/*
1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)

예) 답이 49일 경우:

숫자를 입력하시오: 36
입력하신 숫자보다 큽니다.

숫자를 입력하시오: 51
입력하신 숫자보다 작습니다.

숫자를 입력하시오: 49
정답입니다!
*/
		Random random=new Random();
		int random_num=random.nextInt(99)+1;
		int input_num;
		int count=0;	//오답의 수
		int flag=0;	//오답, 정답 나누기 위함
		while(count<10) {
			Scanner input = new Scanner(System.in);
			System.out.print("숫자를 입력하시오.: ");
			input_num=input.nextInt();
			
			if(random_num>input_num) {
				System.out.println("입력하신 숫자보다 큽니다.");
			}
			else if(random_num<input_num) {
				System.out.println("입력하신 숫자보다 작습니다.");
			}
			else {
				flag=1;
				break;
			}
			count++;
		}
		switch(flag){
			case 0:
				System.out.println("GAMEOVER");
				break;
			case 1:
				System.out.println("정답입니다!");
		}
		System.out.println("=====프로그램 종료=====");
	}
}
		
		


