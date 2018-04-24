package lsj1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;
	
	//protected: 동일 패키지 내에서는 public, 타 패키지에서는 private but 상속 가능
	protected String protectedField;
	
	public Animal(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}
}
