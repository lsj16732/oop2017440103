package lsj1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName;	//package ��������: package �������� public
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField); private�� ����� �ȵ�
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
