import java.util.Scanner;

public class HW_2_19 {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		int input_num;
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.: ");
		input_num=input.nextInt();
		int i=1;
		int count=0;
		while(i<=input_num) {
			if(input_num%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		System.out.println("=====프로그램 종료=====");
			
			
		
	}

}
