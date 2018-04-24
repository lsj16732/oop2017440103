package lsj2;

import lsj1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; ERROR! age is a private field
		
		//Dog aDog = new Dog();	ERROR! Dog는 다른 package의 class이기 때문.
		//타 패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		//2. import 명령어를 사용
		lsj1.Dog aDog = new lsj1.Dog();
		
		aDog.name = "happy!";	//aDog의 name method 사용 가능.
		//aDog.IDN = "23222"; ERROR! IDN is a private field
		
		//aDog.nickame = "kk"; ERROR! nickName은 패키지 접근지정
		
		Animal aa = new Animal();
		//aa.protectedField = "ddd";

	}

}
