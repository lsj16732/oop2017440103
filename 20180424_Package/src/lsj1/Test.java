package lsj1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "tina";
		//tina.IDN = "30942394"	ERROR! IDN is a private field
		
		tina.nickName = "TT";
		
		tina.packageField = "Ed";
		tina.publicField = "U2";
		tina.protectedField = "Beatles";
		//tina.privateField = "Emm"; private field�̹Ƿ� �ٸ� class���� ��� �Ұ�
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
	}

}
