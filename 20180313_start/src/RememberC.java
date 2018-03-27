
public class RememberC {

	public static void main(String[] args) {	//class에는 main문이 반드시 필요하다.
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");	//println의 ln은 엔터라는 의미
		//이 Hello World 결과를 보는 것이 Java Application을 실행하는 것이다.
		
		
		//변수: 메모리 저장공간의 이름. 4bite의 집을 합쳐서 a라고 부르겠다.
		/* 자료형:
		 	1. 변수가 가질 수 있는 값의 범위를 정한다.
		 	2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다.
		 	3. 값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다.
		 */
		/* 변수 선언:
		 	1. 사용할 변수의 이름을 지정한다.
		 	2. 사용할 변수의 자료형을 선언한다.
		 	3. C언어에서와 마찬가지로 Java에서도 변수를 사용하기 전에 반드시 변수 선언을 해야 한다.
		 */
		int a;	//변수 선언. 1. 변수의 이름은 a이다. 2. 변수 a의 자료형은 int이다.
		int b,c,d;
		
		
		//리터럴(literal, 상수): 소스코드에서 값을 표현하는 방법. 하나의 값을 표현하는 방법이 다양할 수 있음. 현재 아무것도 없이 표현하는 것은 10진수로 표현한 것.
		//<예> a = 0x10; 이는 16진수로 16을 표현한 것.
		//연산자: 연산을 위한 기호 (+.-./,*,&,| 등등...)
		//대입연산자(=): 우변의 값을 좌변의 저장소로 이동한다. 우변의 값을 반환한다.
		// <예1> 10 = a; 이건 왜 에러가 날까? 좌변이 저장소가 아닌 값이 들어있기 때문이다.
		// <예2> a = a; 의 좌변과 우변은 다른 것이다. 좌변은 저장소 a, 우변은 값 a.
		//수식(expression): 연산자와 피연산자(리터럴, 변수, 수식)들의 조합. 모든 수식은 값을 반환(리턴)한다.
		//<예> a = a * 10 + 20;
		a = 10;	
		a = a * 10 + 20;
		
		
		//부수효과(side effect): 수식이 값을 반환하는 것 이외 수행하는 모든 작업을 부수효과라 한다.
		//post increment(a++): 반환값은 a, 부수효과는 a=a+1;
		b = a++;	//a의 값을 반환해서 b에 그 값을 넣고, a는 +1이 된다.
		//pre increment(++a): 반환값은 a+1. 부수효과는 a=a+1;
		c=10;
		d=++c;
		
		System.out.println("a = "+a + "	b= "+b);
		System.out.println("c = "+c + "	d= "+d);
		//"a = "는 문자열 +는 연산자 a는 변수
		//+가 왜 있지?? a의 변수의 값을 문자열로 변환해서 앞의 문자열 뒤에 추가한다는 뜻! -> "a = 10"이라는 하나의 문자열이 됨.
		System.out.println("Helllllllo " + "there");	//이런 식으로 문자열을 합칠 수 있어.
		
		
		//java는 부울 자료형과 true/false 리터럴을 사용한다.
		//논리연산자(||, &&)의 피연산자는 부울 변수 또는 리터럴을 사용해야 한다.
		boolean bb;
		boolean cc;
		bb = true;
		cc = false;
		System.out.println("bb= " + bb);
		System.out.println("cc= " +cc);
		
		//관계연산자(>,<,<=,>=,++,!=)의 반환값은 반드시 true/false
		bb= true || false;
		boolean dd;
		System.out.println("dd= "+ (0>1));
		System.out.println("bb= "+bb);
		
		
		//C에서 상수 고정하고 싶으면 const를 썼는데 java에서는 final을 쓴다. 한번 선언하면 값을 바꿀 수 없어.
		final int i = 100;
		//i = 1000;
		//이미 final로 상수로 선언했기 때문에 윗줄의 주석을 해제하면 컴파일 에러 발생.
		System.out.println("i= "+i);
		
		
		//소숫점 자료형 (float, double)
		float ff;
		double ddd;
		ff = 3.14f;
		ddd = 3.14;	//리터럴 3.14의 자료형은 double이다.
		System.out.println("ff= "+ff + " ddd= "+ddd);
		
		
		//형변환 (casting): "유사한, 비슷한" 자료형으로 변환한다.
		int x = 10;
		double y=100.34;
		y = x;	//implicit casting 알아서 y의 자료형을 double에서 int로 바꿔준 것. y=(double) x; 사용해도 됨.
		//x = y; int는 소숫점 아래를 표현할 수 없으므로 implicit casting이 안됨.
		//C언어였다면 워님만 뜨고 알아서 캐스팅해줬을텐데, 자바는 그렇지 않음.
		x = (int) y; //explicit casting. 강제로 캐스팅해주는 것.
		
		System.out.println("x= "+x+" y= "+y);
		
		
	}
}
