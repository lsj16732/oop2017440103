import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;
		char b;
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요. =");
		a = input.nextInt();//키보드에서 숫자 입력
		if(a>=80)
			b='A';
		else if(a>=60)
			b='B';
		else if(a>=40)
			b='C';
		else if(a>=20)
			b='D';
		else
			b='F';
		
		System.out.println("당신의 등급은"+b+"입니다.");
		System.out.println("=====프로그램 종료=====");
		
		}
	}

