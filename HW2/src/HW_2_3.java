
public class HW_2_3 {

	public static void main(String[] args) {
		// 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(while문 사용)
		int i=3;
		int sum=0;
		
		while(i<=100) {
			sum=sum+i;
			i=i+3;
		}
		System.out.println(sum);
		System.out.println("=====프로그램 종료=====");
	}

}
