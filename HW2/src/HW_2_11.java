import java.util.Scanner;

public class HW_2_11 {

	public static void main(String[] args) {
		// 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		//8 => 2 4 
		//12 => 2 3 4 6
		//위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		int num=1;
		int i;
		while(num!=0) {
			Scanner input = new Scanner (System.in);
			System.out.print("정수를 입력하세요.: ");
			num=input.nextInt();

			i=2;
			while(i<num) {
				if(num%i==0) {
					System.out.println(i);
				}
				i++;
			}
		}
		System.out.println("=====프로그램 종료=====");
		
	}

}
