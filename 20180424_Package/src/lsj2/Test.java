package lsj2;

import lsj1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; ERROR! age is a private field
		
		//Dog aDog = new Dog();	ERROR! Dog�� �ٸ� package�� class�̱� ����.
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		//2. import ��ɾ ���
		lsj1.Dog aDog = new lsj1.Dog();
		
		aDog.name = "happy!";	//aDog�� name method ��� ����.
		//aDog.IDN = "23222"; ERROR! IDN is a private field
		
		//aDog.nickame = "kk"; ERROR! nickName�� ��Ű�� ��������
		
		Animal aa = new Animal();
		//aa.protectedField = "ddd";

	}

}
