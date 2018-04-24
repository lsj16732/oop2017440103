package lsj1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName;	//package 접근지정: package 내에서만 public
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField); private는 상속이 안돼
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
