import java.util.Scanner;

public class HW_2_13 {

	public static void main(String[] args) {
		// month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		int month;
		int day;
		int sum=0;
		int i=2;
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Month를 입력하세요: ");
		month=input1.nextInt();
		Scanner input2 = new Scanner (System.in);
		System.out.print("Day를 입력하세요: ");
		day=input2.nextInt();
		
		while(i<=month) {
			switch(i) {
			case 2: case 4: case 6: case 8: case 9: case 11:
				sum=sum+31;
				break;
			case 3:
				sum=sum+28;
				break;
			case 5: case 7: case 10: case 12:
				sum=sum+30;
				break;
			}
			i++;
		}
		sum=sum+day;
		System.out.println(sum);
		System.out.println("=====프로그램 종료=====");
	}
}
