import java.util.Scanner;

public class HW_2_21 {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		int input_num;
		int num=1;
		int i=1;
		int count=0;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.: ");
		input_num=input.nextInt();

		while(num<=input_num) {
			i=1;
			count=0;
			while(i<=num) {
				if(num%i==0) {
					count++;
				}
				i++;
			}
			if(count==2) {
				sum=sum+num;
			}
			num++;
		}
		System.out.println(sum);
		System.out.println("=====프로그램 종료=====");
		
	}

}
