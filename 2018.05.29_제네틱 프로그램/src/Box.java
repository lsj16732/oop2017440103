
public class Box {
	private Object data;	//Object 클래스는 Java의 모든 클래스의 부모 클래스이다. data의 type은 Object
	public void set(Object data) {	//Setter
		this.data = data;
	}
	public Object get() {	//Getter
		return data;
	}
}
