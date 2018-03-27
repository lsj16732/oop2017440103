import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
/*6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
사용자 입력 : 한 개의 두 자리 정수
출력 : 자릿수의 순서가 반대로 된 정수*/
		int number;
		int reverse_number;
		Scanner input = new Scanner(System.in);
		System.out.print("두자리 정수를 입력하세요. =");
		number = input.nextInt();
		if((number%10)==0) {
			reverse_number=number/10;
		}
		else {
			reverse_number=(number%10)*10+number/10;
		}
		System.out.println(reverse_number);
		System.out.println("=====프로그램 종료=====");
	}
}
