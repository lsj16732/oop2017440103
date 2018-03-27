
public class Loop {

	public static void main(String[] args) {
		//1~10 정수를 화면에 출력
		int i;	//i는 루프변수
		i=1;	//1. 루프변수 초기화
		while(i<=10) {	//2. 루프 조건식
			System.out.println(i);	//3.루프문
			i++;	//4. 루프 변수 변화
		}
		
		//1~10 정수를 더해주고 그 값을 출력
		int sum = 0;
		i = 0;	//1. 루프변수 초기화
		while(i<=10) {	//2. 루프 조건식
			sum=sum+i;	//3. 루프 조건문
			i++;	//4. 루프 변수 변화
		}
		System.out.println("Sum = " + sum);
		
		//위의 while문을 for문으로 표현
		sum=0;
		for(i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("sum = " + sum);
		
		//continue문 예제. 조건식으로 돌아간다.
		String s = "no news is good news";
		int n = 0;
		for(i = 0; i<s.length(); i++) {	//length는 메소드임. 길이 나타내는.
			if(s.charAt(i) != 'n')	//charAt는 메소드. i번째 글자. C였다면 메소드가 없어서 엄청 복잡했을텐데.. 메소드 잘 알아야 돼.
				continue;	//조건식으로 돌아가. 만약 i번째 글자가 n이 아니면 n갯수 더하지 않고 다시 조건으로 돌아간다.
			n++;	//만약 i번째 글자가 n이면 n갯수 1 더한다.
		}
		System.out.println("문장에서 발견된 n의 개수= "+n);
		
		System.out.println("==========프로그램 종료==========");
	}

}
