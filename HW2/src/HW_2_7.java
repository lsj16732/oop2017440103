import java.util.Scanner;

public class HW_2_7 {

	public static void main(String[] args) {
		//0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		int a=1;
		int sum=0;
		while(a!=0) {
			Scanner input = new Scanner(System.in);	//다음에 설명
			System.out.print("수를 입력하세요. :");
			a = input.nextInt();//키보드에서 숫자 입력
			sum=sum+a;
		}
		
		System.out.println(sum);
		System.out.println("=====프로그램 종료=====");
		}

		

	}


