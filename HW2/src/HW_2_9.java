import java.util.Scanner;

public class HW_2_9 {

	public static void main(String[] args) {
		//  1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)
		// 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		int input_num=0;
		System.out.print("1~9 사이의 수를 입력하세요. :");
		for(;;) {
			Scanner input = new Scanner(System.in);	//다음에 설명
			input_num = input.nextInt();//키보드에서 숫자 입력
			if((input_num>=1)&&(input_num<=9)){
				break;
			}
			System.out.print("Error. 1~9 사이 숫자를 다시 입력하세요.:");
		}
		int i=1;
		while(i<=10) {
			System.out.println(input_num*i);
			i=i+1;
		}
		System.out.println("=====프로그램 종료=====");
	}

}
