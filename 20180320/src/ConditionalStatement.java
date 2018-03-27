import java.util.Scanner;	//Scanner를 쓰기 위해 필요. 키보드로 값을 입력할 수 있게 돼

public class ConditionalStatement {

	public static void main(String[] args) {
		int score;
		int good = 0;
		System.out.print("성적을 입력하세요: ");
		Scanner input = new Scanner(System.in);	//다음에 설명
		score = input.nextInt();//키보드에서 숫자 입력
		System.out.println("성적은 " + score + " 점입니다.");
		 
		//성적이 60점 이상이면 "합격입니다", 60점 미만이면 "불합격입니다"를 출력
		//비교 >= : 관계연산자
		// if(조건식) {참일 경우 수행} else {거짓일 경우 수행}
		if(score>=60) {
			System.out.println("합격입니다");
			good++;
		}	//하나의 문장에 여러 문장이 들어가. 여러 문장의 중괄호로 묶어 하나의 문장으로 처리-> 복합문 (compound statement)
		else
			System.out.println("불합격입니다");
		//if부터 else까지 한 문장(조건문)이야!!
		//Java는 문장이 하나면 중괄호 없어도 돼, 문장이 여러개면 중괄호 있어야 돼
		 
		//성적이 80점 이상이면 A, 60점 이상이면 B, 60점 미만이면 F가 출력
		if(score>=80)
			System.out.println("A");
		else if(score>=60)
			System.out.println("B");
		else
			System.out.println("F");
		
		//0->"없음", 1->"하나", 2->"둘", 0/1/2가 아니면 ->"많음"을 출력
		switch (score) {
		case 0:
			System.out.println("없음");
			break;	//break를 꼭 해줘야 switch문에서 탈출활 수 있어. break가 없으면 아래로 쭉 실행돼
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("많음");
			break;
		}
		System.out.println("==========프로그램 종료==========");
		}
		
	}	

